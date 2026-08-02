package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5086c0 {

    /* renamed from: androidx.camera.core.impl.c0$a */
    public static abstract class a {
        @NonNull
        public static a a(@NonNull String str, int i11, int i12, int i13, int i14, int i15) {
            return new C5089e(str, i11, i12, i13, i14, i15);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        @NonNull
        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    /* renamed from: androidx.camera.core.impl.c0$b */
    public static abstract class b implements InterfaceC5086c0 {
        @NonNull
        public static b e(int i11, int i12, @NonNull List<a> list, @NonNull List<c> list2) {
            return new C5091f(i11, i12, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* renamed from: androidx.camera.core.impl.c0$c */
    public static abstract class c {
        @NonNull
        public static c a(int i11, @NonNull String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            return new C5093g(i11, str, i12, i13, i14, i15, i16, i17, i18, i19);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        @NonNull
        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    int a();

    @NonNull
    List<a> b();

    int c();

    @NonNull
    List<c> d();
}
