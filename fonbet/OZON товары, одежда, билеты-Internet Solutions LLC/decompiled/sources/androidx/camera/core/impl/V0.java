package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class V0 {

    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        a(int i11) {
            this.mId = i11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b JPEG;
        public static final b JPEG_R;
        public static final b PRIV;
        public static final b RAW;
        public static final b YUV;

        static {
            b bVar = new b("PRIV", 0);
            PRIV = bVar;
            b bVar2 = new b("YUV", 1);
            YUV = bVar2;
            b bVar3 = new b("JPEG", 2);
            JPEG = bVar3;
            b bVar4 = new b("JPEG_R", 3);
            JPEG_R = bVar4;
            b bVar5 = new b("RAW", 4);
            RAW = bVar5;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    V0() {
    }

    @NonNull
    public static V0 a(@NonNull b bVar, @NonNull a aVar) {
        return new C5107n(bVar, aVar, 0L);
    }

    @NonNull
    public static V0 b(@NonNull b bVar, @NonNull a aVar, long j11) {
        return new C5107n(bVar, aVar, j11);
    }

    @NonNull
    public static b e(int i11) {
        return i11 == 35 ? b.YUV : i11 == 256 ? b.JPEG : i11 == 4101 ? b.JPEG_R : i11 == 32 ? b.RAW : b.PRIV;
    }

    @NonNull
    public static V0 g(int i11, int i12, @NonNull Size size, @NonNull W0 w02) {
        b e11 = e(i12);
        a aVar = a.NOT_SUPPORT;
        int a11 = M.c.a(size);
        if (i11 == 1) {
            if (a11 <= M.c.a(w02.g().get(Integer.valueOf(i12)))) {
                aVar = a.s720p;
            } else if (a11 <= M.c.a(w02.f().get(Integer.valueOf(i12)))) {
                aVar = a.s1440p;
            }
        } else if (a11 <= M.c.a(w02.b())) {
            aVar = a.VGA;
        } else if (a11 <= M.c.a(w02.d())) {
            aVar = a.PREVIEW;
        } else if (a11 <= M.c.a(w02.e())) {
            aVar = a.RECORD;
        } else if (a11 <= M.c.a(w02.c().get(Integer.valueOf(i12)))) {
            aVar = a.MAXIMUM;
        } else {
            Size size2 = w02.h().get(Integer.valueOf(i12));
            if (size2 != null) {
                if (a11 <= size2.getHeight() * size2.getWidth()) {
                    aVar = a.ULTRA_MAXIMUM;
                }
            }
        }
        return a(e11, aVar);
    }

    @NonNull
    public abstract a c();

    @NonNull
    public abstract b d();

    public abstract long f();
}
