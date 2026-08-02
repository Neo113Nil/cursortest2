package Pf;

import Of.C3707a;
import Pf.f;
import Pf.q;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

/* renamed from: Pf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3821a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f22446d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", FormPageDTO.Field.FIELD_TYPE_HIDDEN, "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f22447e = Pattern.compile("[^-a-zA-Z0-9_:.]+");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f22448f = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: a, reason: collision with root package name */
    private String f22449a;

    /* renamed from: b, reason: collision with root package name */
    private String f22450b;

    /* renamed from: c, reason: collision with root package name */
    b f22451c;

    public C3821a(String str, String str2, b bVar) {
        Nf.b.d(str);
        String trim = str.trim();
        Nf.b.b(trim);
        this.f22449a = trim;
        this.f22450b = str2;
        this.f22451c = bVar;
    }

    public static String b(String str, f.a.EnumC0445a enumC0445a) {
        if (enumC0445a == f.a.EnumC0445a.xml && !f(str)) {
            String replaceAll = f22447e.matcher(str).replaceAll("_");
            if (f(replaceAll)) {
                return replaceAll;
            }
            return null;
        }
        if (enumC0445a != f.a.EnumC0445a.html || e(str)) {
            return str;
        }
        String replaceAll2 = f22448f.matcher(str).replaceAll("_");
        if (e(replaceAll2)) {
            return replaceAll2;
        }
        return null;
    }

    static void d(String str, String str2, Of.b bVar, f.a aVar) {
        bVar.b(str);
        if (aVar.g() == f.a.EnumC0445a.html) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f22446d, C3707a.a(str)) >= 0) {
                return;
            }
        }
        bVar.b("=\"");
        if (str2 == null) {
            str2 = "";
        }
        j.f(bVar, str2, aVar, 2);
        bVar.a('\"');
    }

    private static boolean e(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 31 || ((charAt >= 127 && charAt <= 159) || charAt == ' ' || charAt == '\"' || charAt == '\'' || charAt == '/' || charAt == '=')) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == '_' || charAt == ':')) {
            return false;
        }
        for (int i11 = 1; i11 < length; i11++) {
            char charAt2 = str.charAt(i11);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '-' || charAt2 == '_' || charAt2 == ':' || charAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final String a() {
        return this.f22449a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String getValue() {
        String str = this.f22450b;
        return str == null ? "" : str;
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (C3821a) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3821a.class == obj.getClass()) {
            C3821a c3821a = (C3821a) obj;
            if (Objects.equals(this.f22449a, c3821a.f22449a) && Objects.equals(this.f22450b, c3821a.f22450b)) {
                return true;
            }
        }
        return false;
    }

    public final q.a g() {
        b bVar = this.f22451c;
        return bVar == null ? q.a.f22500c : bVar.z(this.f22449a);
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f22449a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.f22449a, this.f22450b);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2;
        int q11;
        String str3 = str;
        String str4 = this.f22450b;
        b bVar = this.f22451c;
        if (bVar != null && (q11 = bVar.q((str2 = this.f22449a))) != -1) {
            str4 = this.f22451c.k(str2);
            this.f22451c.f22454c[q11] = str3;
        }
        this.f22450b = str3;
        return str4 == null ? "" : str4;
    }

    public final String toString() {
        StringBuilder b11 = Of.k.b();
        Of.b d11 = Of.b.d(b11);
        f.a aVar = new f.a();
        String str = this.f22450b;
        String b12 = b(this.f22449a, aVar.g());
        if (b12 != null) {
            d(b12, str, d11, aVar);
        }
        return Of.k.l(b11);
    }
}
