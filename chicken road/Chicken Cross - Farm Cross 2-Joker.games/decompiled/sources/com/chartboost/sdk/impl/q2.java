package com.chartboost.sdk.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final q2 f4965a = new q2();

    public final String a(byte[] bArr) {
        String format = String.format("%0" + (bArr.length << 1) + "x", Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final byte[] b(byte[] bArr) {
        return MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr);
    }

    public static final String a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        q2 q2Var = f4965a;
        return q2Var.a(q2Var.b(bytes));
    }
}
