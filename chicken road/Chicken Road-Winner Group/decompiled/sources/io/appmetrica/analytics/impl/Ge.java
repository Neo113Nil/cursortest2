package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Ge {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final C0789qo f5989b;

    /* renamed from: c, reason: collision with root package name */
    public final C0814ro f5990c;

    public Ge(Context context) {
        this(context, new C0789qo(), new C0814ro());
    }

    public final String a(String str) {
        try {
            this.f5990c.getClass();
            if (!C0814ro.a(str)) {
                this.f5989b.getClass();
                str = v2.m.o0(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5988a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Qa.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ge(Context context, C0789qo c0789qo, C0814ro c0814ro) {
        this.f5988a = context;
        this.f5989b = c0789qo;
        this.f5990c = c0814ro;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5988a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f5988a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
