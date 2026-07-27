package com.onesignal.otel.config;

import L3.f;
import M3.o;
import P3.c;
import P3.d;
import V0.j;
import a4.AbstractC0197c;
import a4.C0195a;
import com.onesignal.otel.config.OtelConfigShared;
import d3.C0398a;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import l3.C1255a;
import l3.C1256b;
import l3.C1258d;
import p3.C1382a;
import p3.C1383b;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class OtelConfigCrashFile {

    public static final class SdkLoggerProviderConfig {
        public static final SdkLoggerProviderConfig INSTANCE = new SdkLoggerProviderConfig();
        private static final long MAX_FILE_AGE_FOR_WRITE_MILLIS = 2000;

        private SdkLoggerProviderConfig() {
        }

        public final o create(AbstractC0197c resource, String rootDir, long j2) {
            i.e(resource, "resource");
            i.e(rootDir, "rootDir");
            C1383b fileLogRecordStorage = getFileLogRecordStorage(rootDir, j2);
            Duration duration = C0398a.f5481b;
            C0398a c0398a = new C0398a(new j(fileLogRecordStorage));
            Logger logger = o.f1981e;
            ArrayList arrayList = new ArrayList();
            C0195a c0195a = AbstractC0197c.f3886a;
            ArrayList arrayList2 = new ArrayList();
            f.h();
            String str = c.f2306c;
            arrayList.add(new d(c0398a).a());
            return new o(resource, new a(0, OtelConfigShared.LogLimitsConfig.INSTANCE), arrayList, new L3.i(arrayList2));
        }

        public final C1383b getFileLogRecordStorage(String rootDir, long j2) {
            i.e(rootDir, "rootDir");
            File file = new File(rootDir);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            timeUnit.toMillis(30L);
            timeUnit.toMillis(33L);
            TimeUnit.HOURS.toMillis(18L);
            byte b6 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) 8) | 16)) | 1)) | 2)) | 4)) | 1)) | 2);
            int i2 = C4.a.f392d;
            C4.c unit = C4.c.f399f;
            i.e(unit, "unit");
            long m6 = unit.compareTo(C4.c.f397d) <= 0 ? AbstractC1477a.m(B0.f.l(72, unit, C4.c.f395b)) : AbstractC1477a.B(72, unit);
            long f3 = ((((int) m6) & 1) != 1 || C4.a.d(m6)) ? C4.a.f(m6, C4.c.f396c) : m6 >> 1;
            byte b7 = (byte) (b6 | 4);
            if (b7 == 31) {
                C1382a c1382a = new C1382a(2000L, j2, f3);
                if (j2 <= 2000) {
                    throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
                }
                if (file.isFile()) {
                    throw new IllegalArgumentException("destinationDir must be a directory");
                }
                if (file.exists() || file.mkdirs()) {
                    return new C1383b(new C1255a(new C1258d(new C1256b(file, c1382a)), new j(16)));
                }
                throw new IllegalStateException("Could not create dir: " + file);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & b7) == 0) {
                sb.append(" maxFileAgeForWriteMillis");
            }
            if ((b7 & 2) == 0) {
                sb.append(" minFileAgeForReadMillis");
            }
            if ((b7 & 4) == 0) {
                sb.append(" maxFileAgeForReadMillis");
            }
            if ((b7 & 8) == 0) {
                sb.append(" maxFileSize");
            }
            if ((b7 & 16) == 0) {
                sb.append(" maxFolderSize");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }
    }
}
