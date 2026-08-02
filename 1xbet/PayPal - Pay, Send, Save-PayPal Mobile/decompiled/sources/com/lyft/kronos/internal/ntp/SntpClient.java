package com.lyft.kronos.internal.ntp;

/* loaded from: classes9.dex */
public class SntpClient {
    private final com.lyft.kronos.internal.ntp.DnsResolver Camera2StreamConfigurationMap;
    private final com.lyft.kronos.internal.ntp.DatagramFactory getHighResolutionOutputSizeshNQ4ISI;
    private final com.lyft.kronos.Clock getHighSpeedVideoSizes;

    static class InvalidServerReplyException extends java.io.IOException {
        public InvalidServerReplyException(java.lang.String str) {
            super(str);
        }
    }

    public SntpClient(com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.DnsResolver dnsResolver, com.lyft.kronos.internal.ntp.DatagramFactory datagramFactory) {
        this.getHighSpeedVideoSizes = clock;
        this.Camera2StreamConfigurationMap = dnsResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = datagramFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
    
        if (r0 > 15) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        if (r16 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        r0 = new com.lyft.kronos.internal.ntp.SntpClient.Response(r7, r9, ((r14 - r12) + (r16 - r7)) / 2, r21.getHighSpeedVideoSizes);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010e, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0110, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011b, code lost:
    
        throw new com.lyft.kronos.internal.ntp.SntpClient.InvalidServerReplyException("zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.lyft.kronos.internal.ntp.SntpClient.Response requestTime(java.lang.String str, java.lang.Long l) throws java.io.IOException {
        java.net.DatagramSocket datagramSocket = null;
        try {
            java.net.InetAddress resolve = this.Camera2StreamConfigurationMap.resolve(str);
            java.net.DatagramSocket createSocket = this.getHighResolutionOutputSizeshNQ4ISI.createSocket();
            createSocket.setSoTimeout(l.intValue());
            byte[] bArr = new byte[48];
            java.net.DatagramPacket createPacket = this.getHighResolutionOutputSizeshNQ4ISI.createPacket(bArr, resolve, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            bArr[0] = com.google.common.base.Ascii.ESC;
            long currentTimeMs = this.getHighSpeedVideoSizes.getCurrentTimeMs();
            long elapsedTimeMs = this.getHighSpeedVideoSizes.getElapsedTimeMs();
            long j = currentTimeMs / 1000;
            bArr[40] = (byte) (r6 >> 24);
            bArr[41] = (byte) (r6 >> 16);
            bArr[42] = (byte) (r6 >> 8);
            bArr[43] = (byte) (j + 2208988800L);
            long j2 = ((currentTimeMs - (j * 1000)) * 4294967296L) / 1000;
            bArr[44] = (byte) (j2 >> 24);
            bArr[45] = (byte) (j2 >> 16);
            bArr[46] = (byte) (j2 >> 8);
            bArr[47] = (byte) (java.lang.Math.random() * 255.0d);
            createSocket.send(createPacket);
            byte[] copyOf = java.util.Arrays.copyOf(bArr, 48);
            createSocket.receive(this.getHighResolutionOutputSizeshNQ4ISI.createPacket(copyOf));
            long elapsedTimeMs2 = this.getHighSpeedVideoSizes.getElapsedTimeMs();
            long j3 = currentTimeMs + (elapsedTimeMs2 - elapsedTimeMs);
            byte b = copyOf[0];
            byte b2 = (byte) ((b >> 6) & 3);
            byte b3 = (byte) (b & 7);
            byte b4 = copyOf[1];
            long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(copyOf, 24);
            long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(copyOf, 32);
            long Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(copyOf, 40);
            int i = b4 & 255;
            if (b2 == 3) {
                throw new com.lyft.kronos.internal.ntp.SntpClient.InvalidServerReplyException("unsynchronized server");
            }
            if (b3 != 4 && b3 != 5) {
                throw new com.lyft.kronos.internal.ntp.SntpClient.InvalidServerReplyException("untrusted mode: ".concat(java.lang.String.valueOf((int) b3)));
            }
            throw new com.lyft.kronos.internal.ntp.SntpClient.InvalidServerReplyException("untrusted stratum: ".concat(java.lang.String.valueOf(i)));
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                datagramSocket.close();
            }
            throw th;
        }
    }

    private static long getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
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

    private static long Camera2StreamConfigurationMap(byte[] bArr, int i) {
        return ((getHighSpeedVideoFpsRangesFor(bArr, i) - 2208988800L) * 1000) + ((getHighSpeedVideoFpsRangesFor(bArr, i + 4) * 1000) / 4294967296L);
    }

    public static final class Response {
        final com.lyft.kronos.Clock getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        private final long getHighSpeedVideoSizes;

        Response(long j, long j2, long j3, com.lyft.kronos.Clock clock) {
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoFpsRangesFor = j2;
            this.getHighSpeedVideoSizes = j3;
            this.getHighResolutionOutputSizeshNQ4ISI = clock;
        }

        public final long getCurrentTimeMs() {
            return this.getHighSpeedVideoFpsRanges + this.getHighSpeedVideoSizes + getResponseAge();
        }

        public final long getOffsetMs() {
            return this.getHighSpeedVideoSizes;
        }

        public final long getResponseAge() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs() - this.getHighSpeedVideoFpsRangesFor;
        }
    }
}
