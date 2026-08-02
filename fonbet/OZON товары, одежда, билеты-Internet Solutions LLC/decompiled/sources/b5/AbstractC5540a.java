package b5;

import android.os.Build;
import androidx.annotation.NonNull;
import b5.C5558s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5540a implements InterfaceC5552m {

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet f55528c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f55529a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55530b;

    /* renamed from: b5.a$a, reason: collision with other inner class name */
    private static class C0830a {

        /* renamed from: a, reason: collision with root package name */
        static final HashSet f55531a = new HashSet(Arrays.asList(C5558s.b.f55543a.a()));
    }

    /* renamed from: b5.a$b */
    public static class b extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return true;
        }
    }

    /* renamed from: b5.a$c */
    public static class c extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return true;
        }
    }

    /* renamed from: b5.a$d */
    public static class d extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return false;
        }
    }

    /* renamed from: b5.a$e */
    public static class e extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return true;
        }
    }

    /* renamed from: b5.a$f */
    public static class f extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: b5.a$g */
    public static class g extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: b5.a$h */
    public static class h extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: b5.a$i */
    public static class i extends AbstractC5540a {
        @Override // b5.AbstractC5540a
        public final boolean a() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC5540a(@NonNull String str, @NonNull String str2) {
        this.f55529a = str;
        this.f55530b = str2;
        f55528c.add(this);
    }

    @NonNull
    public static Set<AbstractC5540a> e() {
        return Collections.unmodifiableSet(f55528c);
    }

    public abstract boolean a();

    @Override // b5.InterfaceC5552m
    public final boolean b() {
        return a() || d();
    }

    @Override // b5.InterfaceC5552m
    @NonNull
    public final String c() {
        return this.f55529a;
    }

    public boolean d() {
        HashSet hashSet = C0830a.f55531a;
        String str = this.f55530b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
