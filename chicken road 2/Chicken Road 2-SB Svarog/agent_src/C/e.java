package C;

import P.f;
import P.i;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import f.C0025a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.j;
import io.flutter.view.l;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Object f8a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11d;

    public e(C0025a c0025a) {
        this.f11d = c0025a;
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public SpannableString a() {
        if (((String) this.f8a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f8a);
        List<l> list = (List) this.f9b;
        if (list != null) {
            for (l lVar : list) {
                int a2 = AbstractC0071c.a(lVar.f833c);
                if (a2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f831a, lVar.f832b, 0);
                } else if (a2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) lVar).f830d)), lVar.f831a, lVar.f832b, 0);
                }
            }
        }
        String str = (String) this.f11d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f11d), 0, ((String) this.f8a).length(), 0);
        }
        String str2 = (String) this.f10c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f10c)), 0, ((String) this.f8a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((C0025a) this.f11d).f493c[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((C0025a) this.f11d).h(i2);
    }

    public File e(Context context) {
        ((b) this.f9b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void f(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((G.l) this.f11d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void g(Serializable serializable, P.c cVar) {
        ((f) this.f8a).b((String) this.f9b, ((i) this.f10c).b(serializable), cVar == null ? null : new P.a(0, this, cVar));
    }

    public void h(P.b bVar) {
        String str = (String) this.f9b;
        f fVar = (f) this.f8a;
        b bVar2 = (b) this.f11d;
        if (bVar2 != null) {
            fVar.j(str, bVar != null ? new a(this, bVar, 11, false) : null, bVar2);
        } else {
            fVar.i(str, bVar != null ? new a(this, bVar, 11, false) : null);
        }
    }

    public Object[] i(Object[] objArr, int i2) {
        int i3 = ((C0025a) this.f11d).f494d;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = b(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public e(f fVar, String str, i iVar, b bVar) {
        this.f8a = fVar;
        this.f9b = str;
        this.f10c = iVar;
        this.f11d = bVar;
    }
}
