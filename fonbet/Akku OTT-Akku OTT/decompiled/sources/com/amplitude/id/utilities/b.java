package com.amplitude.id.utilities;

import androidx.compose.runtime.changelist.d;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPropertiesFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertiesFile.kt\ncom/amplitude/id/utilities/PropertiesFile\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1855#2,2:126\n*S KotlinDebug\n*F\n+ 1 PropertiesFile.kt\ncom/amplitude/id/utilities/PropertiesFile\n*L\n97#1:126,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public final com.amplitude.common.a a;
    public final Properties b;
    public final File c;

    public b(File directory, String fileNameWithoutExtension, com.amplitude.common.a aVar) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileNameWithoutExtension, "fileNameWithoutExtension");
        this.a = aVar;
        this.b = new Properties();
        this.c = new File(directory, d.b(fileNameWithoutExtension, ".properties"));
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.setProperty(key, value);
        b();
    }

    public final void b() {
        File file = this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.b.store(fileOutputStream, (String) null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            com.amplitude.common.a aVar = this.a;
            if (aVar != null) {
                aVar.b("Failed to save property file with path " + file.getAbsolutePath() + ", error stacktrace: " + ExceptionsKt.stackTraceToString(th));
            }
        }
    }
}
