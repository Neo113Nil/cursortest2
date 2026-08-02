package com.dogearn.dogemoney;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes.dex */
public class SntpClient {
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int REFERENCE_TIME_OFFSET = 16;
    private static final String TAG = "SntpClient";
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private long mNtpTime;
    private long mNtpTimeReference;
    private long mRoundTripTime;

    public boolean requestTime(String str, int i) {
        DatagramSocket datagramSocket;
        try {
            datagramSocket = new DatagramSocket();
            try {
                datagramSocket.setSoTimeout(i);
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, InetAddress.getByName(str), NTP_PORT);
                bArr[0] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                writeTimeStamp(bArr, 40, currentTimeMillis);
                datagramSocket.send(datagramPacket);
                datagramSocket.receive(new DatagramPacket(bArr, bArr.length));
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j = elapsedRealtime2 - elapsedRealtime;
                long j2 = currentTimeMillis + j;
                long readTimeStamp = readTimeStamp(bArr, 24);
                long readTimeStamp2 = readTimeStamp(bArr, 32);
                long readTimeStamp3 = readTimeStamp(bArr, 40);
                this.mNtpTime = j2 + (((readTimeStamp2 - readTimeStamp) + (readTimeStamp3 - j2)) / 2);
                this.mNtpTimeReference = elapsedRealtime2;
                this.mRoundTripTime = j - (readTimeStamp3 - readTimeStamp2);
                datagramSocket.close();
                return true;
            } catch (Exception unused) {
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            datagramSocket = null;
        } catch (Throwable th2) {
            th = th2;
            datagramSocket = null;
        }
    }

    public long getNtpTime() {
        return this.mNtpTime;
    }

    public long getNtpTimeReference() {
        return this.mNtpTimeReference;
    }

    public long getRoundTripTime() {
        return this.mRoundTripTime;
    }

    private long read32(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    private long readTimeStamp(byte[] bArr, int i) {
        return ((read32(bArr, i) - OFFSET_1900_TO_1970) * 1000) + ((read32(bArr, i + 4) * 1000) / 4294967296L);
    }

    private void writeTimeStamp(byte[] bArr, int i, long j) {
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + OFFSET_1900_TO_1970;
        int i2 = i + 1;
        bArr[i] = (byte) (j4 >> 24);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j4 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j4 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j4 >> 0);
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j5 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j5 >> 16);
        bArr[i7] = (byte) (j5 >> 8);
        bArr[i7 + 1] = (byte) (Math.random() * 255.0d);
    }
}
