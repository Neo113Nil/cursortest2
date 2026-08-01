package com.inmobi.media;

import android.os.SystemClock;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public abstract class Nl {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6747a = {106, 19, -57, 77, -111, 46, 88, -81, 51, -28, 123, Ascii.EM, -46, -116, 69, -16, 39, -74, 93, -95, 60, -23, 114, Ascii.DC4, -53, 104, -97, 48, 86, -19, -124, 33};

    public static byte[] a(String bundleId, byte[] payloadBytes) {
        Intrinsics.checkNotNullParameter(payloadBytes, "payloadBytes");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        return a(payloadBytes, bundleId, SystemClock.elapsedRealtimeNanos());
    }

    public static byte[] a(byte[] payloadBytes, String bundleId, long j) {
        Intrinsics.checkNotNullParameter(payloadBytes, "payloadBytes");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(f6747a);
        byte[] bytes = bundleId.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        if (digest.length != 32) {
            throw new IllegalStateException("Check failed.");
        }
        Intrinsics.checkNotNull(digest);
        int length = payloadBytes.length;
        byte[] bArr = new byte[length];
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, payloadBytes.length - 1, 8);
        if (progressionLastElement >= 0) {
            int i = 0;
            while (true) {
                long j2 = i ^ j;
                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong((j2 ^ (j2 >>> 33)) * (-49064778989728563L)).array();
                Intrinsics.checkNotNullExpressionValue(array, "array(...)");
                int i2 = i + 8;
                int min = Math.min(i2, payloadBytes.length);
                for (int i3 = i; i3 < min; i3++) {
                    bArr[i3] = (byte) (((byte) (digest[i3 % digest.length] ^ payloadBytes[i3])) ^ array[i3 - i]);
                }
                if (i == progressionLastElement) {
                    break;
                }
                i = i2;
            }
        }
        byte[] array2 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array();
        Intrinsics.checkNotNullExpressionValue(array2, "array(...)");
        byte[] copyOfRange = ArraysKt.copyOfRange(digest, 0, 8);
        int length2 = array2.length;
        byte[] bArr2 = new byte[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            bArr2[i4] = (byte) (array2[i4] ^ copyOfRange[i4]);
        }
        Intrinsics.checkNotNullExpressionValue("Nl", "TAG");
        int i5 = length + 13;
        String str = "Synapse payload encoded. payloadBytes=" + payloadBytes.length + ", envelopeBytes=" + i5;
        byte[] array3 = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN).put((byte) 1).put(bArr2).putInt(length).put(bArr).array();
        Intrinsics.checkNotNullExpressionValue(array3, "array(...)");
        return array3;
    }
}
