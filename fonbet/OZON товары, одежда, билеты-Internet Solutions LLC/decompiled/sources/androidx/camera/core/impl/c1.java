package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f38274a = new a();

    final class a implements c1 {
        @Override // androidx.camera.core.impl.c1
        public final T a(@NonNull b bVar, int i11) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b IMAGE_ANALYSIS;
        public static final b IMAGE_CAPTURE;
        public static final b METERING_REPEATING;
        public static final b PREVIEW;
        public static final b STREAM_SHARING;
        public static final b VIDEO_CAPTURE;

        static {
            b bVar = new b("IMAGE_CAPTURE", 0);
            IMAGE_CAPTURE = bVar;
            b bVar2 = new b("PREVIEW", 1);
            PREVIEW = bVar2;
            b bVar3 = new b("IMAGE_ANALYSIS", 2);
            IMAGE_ANALYSIS = bVar3;
            b bVar4 = new b("VIDEO_CAPTURE", 3);
            VIDEO_CAPTURE = bVar4;
            b bVar5 = new b("STREAM_SHARING", 4);
            STREAM_SHARING = bVar5;
            b bVar6 = new b("METERING_REPEATING", 5);
            METERING_REPEATING = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
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

    public interface c {
        @NonNull
        v.G0 a(@NonNull Context context) throws C.P;
    }

    T a(@NonNull b bVar, int i11);
}
