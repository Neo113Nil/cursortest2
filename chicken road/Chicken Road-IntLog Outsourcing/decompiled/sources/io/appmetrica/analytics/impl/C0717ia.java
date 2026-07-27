package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import r4.AbstractC1408b;
import u1.AbstractC1477a;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717ia implements Do {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8413b;

    public C0717ia(Context context, String str) {
        this.f8412a = context;
        this.f8413b = str;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f8412a, this.f8413b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f8412a, this.f8413b);
                if (fileFromAppStorage != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                return AbstractC1408b.N(fileFromSdkStorage);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String text) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f8412a, this.f8413b);
            if (fileFromSdkStorage == null) {
                return;
            }
            Charset charset = B4.a.f287a;
            kotlin.jvm.internal.i.e(text, "text");
            kotlin.jvm.internal.i.e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromSdkStorage);
            try {
                AbstractC1408b.O(fileOutputStream, text, charset);
                AbstractC1477a.e(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
