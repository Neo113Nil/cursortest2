package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final a f38383a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR;

        static {
            a aVar = new a("ERROR", 0);
            ERROR = aVar;
            $VALUES = new a[]{aVar};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public r(@NonNull a aVar) {
        this.f38383a = aVar;
    }

    public Object a() {
        return null;
    }

    @NonNull
    public final a b() {
        return this.f38383a;
    }
}
