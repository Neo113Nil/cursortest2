package W;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: W.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4852x {

    /* renamed from: a, reason: collision with root package name */
    public static final C4852x f33147a;

    /* renamed from: b, reason: collision with root package name */
    public static final C4852x f33148b;

    /* renamed from: c, reason: collision with root package name */
    public static final C4852x f33149c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4852x f33150d;

    /* renamed from: e, reason: collision with root package name */
    public static final C4852x f33151e;

    /* renamed from: f, reason: collision with root package name */
    public static final C4852x f33152f;

    /* renamed from: g, reason: collision with root package name */
    static final C4852x f33153g;

    /* renamed from: h, reason: collision with root package name */
    private static final HashSet f33154h;

    /* renamed from: i, reason: collision with root package name */
    private static final List<C4852x> f33155i;

    /* renamed from: W.x$a */
    public static abstract class a extends C4852x {
        public a() {
            super(0);
        }

        @NonNull
        public abstract String c();

        @NonNull
        public abstract List<Size> d();

        public abstract int e();
    }

    static {
        C4839j c4839j = new C4839j(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f33147a = c4839j;
        C4839j c4839j2 = new C4839j(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f33148b = c4839j2;
        C4839j c4839j3 = new C4839j(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f33149c = c4839j3;
        C4839j c4839j4 = new C4839j(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f33150d = c4839j4;
        List list = Collections.EMPTY_LIST;
        C4839j c4839j5 = new C4839j(0, "LOWEST", list);
        f33151e = c4839j5;
        C4839j c4839j6 = new C4839j(1, "HIGHEST", list);
        f33152f = c4839j6;
        f33153g = new C4839j(-1, "NONE", list);
        f33154h = new HashSet(Arrays.asList(c4839j5, c4839j6, c4839j, c4839j2, c4839j3, c4839j4));
        f33155i = Arrays.asList(c4839j4, c4839j3, c4839j2, c4839j);
    }

    /* synthetic */ C4852x(int i11) {
        this();
    }

    static boolean a(@NonNull C4852x c4852x) {
        return f33154h.contains(c4852x);
    }

    @NonNull
    public static ArrayList b() {
        return new ArrayList(f33155i);
    }

    private C4852x() {
    }
}
