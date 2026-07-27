package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568ia implements Do {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7504b;

    public C0568ia(Context context, String str) {
        this.f7503a = context;
        this.f7504b = str;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7503a, this.f7504b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f7503a, this.f7504b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return m2.b.T(fileFromSdkStorage);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String text) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7503a, this.f7504b);
            if (fileFromSdkStorage == null) {
                return;
            }
            Charset charset = v2.a.f10417a;
            kotlin.jvm.internal.j.e(text, "text");
            kotlin.jvm.internal.j.e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromSdkStorage);
            try {
                m2.b.U(fileOutputStream, text, charset);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
