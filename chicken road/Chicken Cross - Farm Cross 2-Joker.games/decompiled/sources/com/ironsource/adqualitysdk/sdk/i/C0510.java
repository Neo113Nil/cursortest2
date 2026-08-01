package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.з, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0510 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0972 f1162;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0589 f1163;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0630 f1164;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final Charset f1161 = Charset.forName(StringFog.decrypt("5Po6J7c=\n", "sa58Co+deGQ=\n"));

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final Charset f1160 = Charset.forName(StringFog.decrypt("pfTei4kHgv4=\n", "8KfzytpEy7c=\n"));

    public C0510(C0630 c0630, C0589 c0589, C0972 c0972) {
        this.f1164 = c0630;
        this.f1163 = c0589;
        this.f1162 = c0972;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5485(String str, String str2, long j, C1236 c1236) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringFog.decrypt("H8zKypeb1Ucuw8k=\n", "eqKuuvjyuzM=\n"), str);
            jSONObject.put(StringFog.decrypt("wX1z3rNk8oPddw==\n", "shkYiNYWgeo=\n"), this.f1162.f2878);
            jSONObject.put(StringFog.decrypt("Ws4Uh7poU05T\n", "O75kzt4gMj0=\n"), this.f1162.f2877);
            jSONObject.put(StringFog.decrypt("S43d7N7ZLO1d\n", "OeismbuqWKQ=\n"), str2);
            jSONObject.put(StringFog.decrypt("GrV+1LUT2Nke\n", "btwTscZnubQ=\n"), j);
            jSONObject.put(StringFog.decrypt("P8ntTazbtFgv4fVJrNo=\n", "VqeZKMup3Sw=\n"), c1236.m5937());
            return jSONObject.toString().getBytes(f1161);
        } catch (Exception e) {
            throw new RuntimeException(StringFog.decrypt("QymEf0O+WxVqaI9mT7YfQUQJqTNsiTQv\n", "BUjtEybae2E=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m5484(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 20 + bArr2.length + 2 + bArr3.length + 4 + bArr4.length);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(StringFog.decrypt("83sOfQ==\n", "pjpKLNMmEOE=\n").getBytes(f1160));
            dataOutputStream.writeByte(1);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(bArr.length);
            dataOutputStream.write(bArr);
            dataOutputStream.writeByte(bArr2.length);
            dataOutputStream.write(bArr2);
            dataOutputStream.writeShort(bArr3.length);
            dataOutputStream.write(bArr3);
            dataOutputStream.writeInt(bArr4.length);
            dataOutputStream.write(bArr4);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(StringFog.decrypt("P2Ni4TRbPgsWInjoI1Z/ExB4bq00UWgaFW176A==\n", "eQILjVE/Hn8=\n"), e);
        }
    }
}
