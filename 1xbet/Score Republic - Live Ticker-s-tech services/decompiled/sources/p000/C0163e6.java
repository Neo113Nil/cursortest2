package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0163e6 implements kw0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1963j;

    /* JADX INFO: renamed from: k */
    public int f1964k;

    /* JADX INFO: renamed from: l */
    public Object f1965l;

    /* JADX INFO: renamed from: m */
    public Object f1966m;

    public C0163e6(int i, int i2) {
        this.f1963j = i2;
        switch (i2) {
            case 5:
                if (i <= 0) {
                    C0270h1.m2190f("The max pool size must be > 0");
                    throw null;
                }
                this.f1965l = new Object[i];
                this.f1966m = new Object();
                return;
            default:
                this.f1965l = new Object[i * 2];
                this.f1964k = 0;
                return;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0163e6 m1365f(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        ky0 ky0Var = ky0.f4591k;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                ky0Var = ky0.f4592l;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C0163e6(ky0Var, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    @Override // p000.kw0
    /* JADX INFO: renamed from: a */
    public boolean mo1366a(Object obj) {
        boolean z;
        obj.getClass();
        synchronized (this.f1966m) {
            try {
                Object[] objArr = (Object[]) this.f1965l;
                int i = this.f1964k;
                z = false;
                for (int i2 = 0; i2 < i; i2++) {
                    if (objArr[i2] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                }
                int i3 = this.f1964k;
                if (i3 < objArr.length) {
                    objArr[i3] = obj;
                    z = true;
                    this.f1964k = i3 + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.kw0
    /* JADX INFO: renamed from: b */
    public Object mo1367b() {
        Object obj;
        synchronized (this.f1966m) {
            Object[] objArr = (Object[]) this.f1965l;
            int i = this.f1964k;
            obj = null;
            if (i > 0) {
                int i2 = i - 1;
                Object obj2 = objArr[i2];
                obj2.getClass();
                objArr[i2] = null;
                this.f1964k--;
                obj = obj2;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public void m1368c() {
        C0290hl c0290hl;
        ImageView imageView = (ImageView) this.f1965l;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0890xu.m5688a(drawable);
        }
        if (drawable == null || (c0290hl = (C0290hl) this.f1966m) == null) {
            return;
        }
        C0939z5.m5861d(drawable, c0290hl, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: d */
    public v01 m1369d(boolean z) {
        rc0 rc0Var;
        rc0 rc0Var2;
        if (z && (rc0Var2 = (rc0) this.f1966m) != null) {
            throw rc0Var2.m4337a();
        }
        v01 v01VarM5019a = v01.m5019a(this.f1964k, (Object[]) this.f1965l, this);
        if (!z || (rc0Var = (rc0) this.f1966m) == null) {
            return v01VarM5019a;
        }
        throw rc0Var.m4337a();
    }

    /* JADX INFO: renamed from: e */
    public void m1370e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1965l;
        Context context = imageView.getContext();
        int[] iArr = mz0.f5192f;
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = j22.m2807p(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0890xu.m5688a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(oq0VarM3731n.m3734d(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC0890xu.m5689b(typedArray.getInt(3, -1), null));
            }
        } finally {
            oq0VarM3731n.m3742o();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1371g(Object obj, Object obj2) {
        int i = (this.f1964k + 1) * 2;
        Object[] objArr = (Object[]) this.f1965l;
        if (i > objArr.length) {
            this.f1965l = Arrays.copyOf(objArr, kc0.m3003b(objArr.length, i));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f1965l;
        int i2 = this.f1964k;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f1964k = i2 + 1;
    }

    /* JADX INFO: renamed from: h */
    public void m1372h(Set set) {
        if (set != null) {
            int size = (set.size() + this.f1964k) * 2;
            Object[] objArr = (Object[]) this.f1965l;
            if (size > objArr.length) {
                this.f1965l = Arrays.copyOf(objArr, kc0.m3003b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m1371g(entry.getKey(), entry.getValue());
        }
    }

    public String toString() {
        switch (this.f1963j) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f1965l);
                sb.append("://");
                int i = -1;
                if (((String) this.f1966m).indexOf(58) != -1) {
                    sb.append('[');
                    sb.append((String) this.f1966m);
                    sb.append(']');
                } else {
                    sb.append((String) this.f1966m);
                }
                int i2 = this.f1964k;
                if (i2 == -1) {
                    String str = (String) this.f1965l;
                    if (str.equals("http")) {
                        i2 = 80;
                    } else {
                        i2 = str.equals("https") ? 443 : -1;
                    }
                }
                String str2 = (String) this.f1965l;
                if (str2.equals("http")) {
                    i = 80;
                } else if (str2.equals("https")) {
                    i = 443;
                }
                if (i2 != i) {
                    sb.append(':');
                    sb.append(i2);
                }
                return sb.toString();
            case 6:
                String str3 = (String) this.f1966m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((ky0) this.f1965l) == ky0.f4591k ? "HTTP/1.0" : "HTTP/1.1");
                sb2.append(' ');
                sb2.append(this.f1964k);
                sb2.append(' ');
                sb2.append(str3);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C0163e6(int i, byte b) {
        this.f1963j = i;
        switch (i) {
            case 3:
                break;
            default:
                Object[] objArr = new Object[5];
                this.f1965l = objArr;
                this.f1966m = objArr;
                break;
        }
    }

    public C0163e6(ImageView imageView) {
        this.f1963j = 0;
        this.f1964k = 0;
        this.f1965l = imageView;
    }

    public C0163e6(ky0 ky0Var, int i, String str) {
        this.f1963j = 6;
        this.f1965l = ky0Var;
        this.f1964k = i;
        this.f1966m = str;
    }

    public C0163e6(p90 p90Var) {
        this.f1963j = 2;
        this.f1966m = wo1.m5393t(150, new nu1(19, this));
        this.f1965l = p90Var;
    }
}
