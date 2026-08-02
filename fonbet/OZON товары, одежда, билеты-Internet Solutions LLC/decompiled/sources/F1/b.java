package F1;

import Sc.o;
import android.R;

/* loaded from: classes8.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* renamed from: id, reason: collision with root package name */
    private final int f8374id;
    private final int order;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8375a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8375a = iArr;
        }
    }

    b(int i11) {
        this.f8374id = i11;
        this.order = i11;
    }

    public final int a() {
        return this.f8374id;
    }

    public final int b() {
        return this.order;
    }

    public final int d() {
        int i11 = a.f8375a[ordinal()];
        if (i11 == 1) {
            return R.string.copy;
        }
        if (i11 == 2) {
            return R.string.paste;
        }
        if (i11 == 3) {
            return R.string.cut;
        }
        if (i11 == 4) {
            return R.string.selectAll;
        }
        throw new o();
    }
}
