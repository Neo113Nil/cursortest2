package M8;

import B0.A0;
import C.o0;
import M8.d;
import M8.j;
import T7.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f17609h = Logger.getLogger(e.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private static final Map<Integer, String> f17610i;

    /* renamed from: j, reason: collision with root package name */
    private static final Set<Integer> f17611j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set<Integer> f17612k;

    /* renamed from: l, reason: collision with root package name */
    private static final Map<Character, Character> f17613l;

    /* renamed from: m, reason: collision with root package name */
    private static final Map<Character, Character> f17614m;

    /* renamed from: n, reason: collision with root package name */
    private static final Map<Character, Character> f17615n;

    /* renamed from: o, reason: collision with root package name */
    private static final Map<Character, Character> f17616o;

    /* renamed from: p, reason: collision with root package name */
    static final Pattern f17617p;

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f17618q;

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f17619r;

    /* renamed from: s, reason: collision with root package name */
    static final Pattern f17620s;

    /* renamed from: t, reason: collision with root package name */
    static final Pattern f17621t;

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f17622u;

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f17623v;

    /* renamed from: w, reason: collision with root package name */
    private static final Pattern f17624w;

    /* renamed from: x, reason: collision with root package name */
    private static final Pattern f17625x;

    /* renamed from: y, reason: collision with root package name */
    private static e f17626y;

    /* renamed from: a, reason: collision with root package name */
    private final Q8.g f17627a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f17628b;

    /* renamed from: c, reason: collision with root package name */
    private final N8.a f17629c = N8.a.a();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f17630d = new HashSet(35);

    /* renamed from: e, reason: collision with root package name */
    private final N8.b f17631e = new N8.b(100);

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f17632f = new HashSet(320);

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f17633g = new HashSet();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17634a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17635b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f17636c;

        static {
            int[] iArr = new int[c.values().length];
            f17636c = iArr;
            try {
                iArr[c.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17636c[c.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17636c[c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17636c[c.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17636c[c.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17636c[c.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17636c[c.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17636c[c.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17636c[c.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17636c[c.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17636c[c.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[b.values().length];
            f17635b = iArr2;
            try {
                iArr2[b.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17635b[b.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17635b[b.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17635b[b.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[j.a.values().length];
            f17634a = iArr3;
            try {
                iArr3[j.a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17634a[j.a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17634a[j.a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f17634a[j.a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b E164;
        public static final b INTERNATIONAL;
        public static final b NATIONAL;
        public static final b RFC3966;

        static {
            b bVar = new b("E164", 0);
            E164 = bVar;
            b bVar2 = new b("INTERNATIONAL", 1);
            INTERNATIONAL = bVar2;
            b bVar3 = new b("NATIONAL", 2);
            NATIONAL = bVar3;
            b bVar4 = new b("RFC3966", 3);
            RFC3966 = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c FIXED_LINE;
        public static final c FIXED_LINE_OR_MOBILE;
        public static final c MOBILE;
        public static final c PAGER;
        public static final c PERSONAL_NUMBER;
        public static final c PREMIUM_RATE;
        public static final c SHARED_COST;
        public static final c TOLL_FREE;
        public static final c UAN;
        public static final c UNKNOWN;
        public static final c VOICEMAIL;
        public static final c VOIP;

        static {
            c cVar = new c("FIXED_LINE", 0);
            FIXED_LINE = cVar;
            c cVar2 = new c("MOBILE", 1);
            MOBILE = cVar2;
            c cVar3 = new c("FIXED_LINE_OR_MOBILE", 2);
            FIXED_LINE_OR_MOBILE = cVar3;
            c cVar4 = new c("TOLL_FREE", 3);
            TOLL_FREE = cVar4;
            c cVar5 = new c("PREMIUM_RATE", 4);
            PREMIUM_RATE = cVar5;
            c cVar6 = new c("SHARED_COST", 5);
            SHARED_COST = cVar6;
            c cVar7 = new c("VOIP", 6);
            VOIP = cVar7;
            c cVar8 = new c("PERSONAL_NUMBER", 7);
            PERSONAL_NUMBER = cVar8;
            c cVar9 = new c("PAGER", 8);
            PAGER = cVar9;
            c cVar10 = new c("UAN", 9);
            UAN = cVar10;
            c cVar11 = new c("VOICEMAIL", 10);
            VOICEMAIL = cVar11;
            c cVar12 = new c(FraudMonInfo.UNKNOWN, 11);
            UNKNOWN = cVar12;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d INVALID_COUNTRY_CODE;
        public static final d INVALID_LENGTH;
        public static final d IS_POSSIBLE;
        public static final d IS_POSSIBLE_LOCAL_ONLY;
        public static final d TOO_LONG;
        public static final d TOO_SHORT;

        static {
            d dVar = new d("IS_POSSIBLE", 0);
            IS_POSSIBLE = dVar;
            d dVar2 = new d("IS_POSSIBLE_LOCAL_ONLY", 1);
            IS_POSSIBLE_LOCAL_ONLY = dVar2;
            d dVar3 = new d("INVALID_COUNTRY_CODE", 2);
            INVALID_COUNTRY_CODE = dVar3;
            d dVar4 = new d("TOO_SHORT", 3);
            TOO_SHORT = dVar4;
            d dVar5 = new d("INVALID_LENGTH", 4);
            INVALID_LENGTH = dVar5;
            d dVar6 = new d("TOO_LONG", 5);
            TOO_LONG = dVar6;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        f17610i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f17611j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f17612k = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f17614m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f17615n = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f17613l = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch2 : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch2.charValue())), ch2);
            hashMap6.put(ch2, ch2);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        f17616o = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Character> map = f17614m;
        sb2.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb3 = sb2.toString();
        f17617p = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f17618q = Pattern.compile("(\\p{Nd})");
        f17619r = Pattern.compile("[+＋\\p{Nd}]");
        f17620s = Pattern.compile("[\\\\/] *x");
        f17621t = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f17622u = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String b11 = A0.b("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb3, "\\p{Nd}]*");
        String a11 = a(true);
        a(false);
        f17623v = Pattern.compile("(?:" + a11 + ")$", 66);
        f17624w = Pattern.compile(b11 + "(?:" + a11 + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        f17625x = Pattern.compile("\\(?\\$1\\)?");
        f17626y = null;
    }

    e(Q8.g gVar, HashMap hashMap) {
        this.f17627a = gVar;
        this.f17628b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f17633g.add(entry.getKey());
            } else {
                this.f17632f.addAll(list);
            }
        }
        if (this.f17632f.remove("001")) {
            f17609h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f17630d.addAll((Collection) hashMap.get(1));
    }

    private static String a(boolean z11) {
        String str = ";ext=" + b(20);
        String c11 = o0.c(new StringBuilder("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*"), b(20), "#?");
        String c12 = o0.c(new StringBuilder("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*"), b(9), "#?");
        String c13 = o0.c(new StringBuilder("[- ]+"), b(6), "#");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("|");
        sb2.append(c11);
        sb2.append("|");
        sb2.append(c12);
        String c14 = o0.c(sb2, "|", c13);
        if (!z11) {
            return c14;
        }
        return c14 + "|" + o0.c(new StringBuilder("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*"), b(15), "#?") + "|" + o0.c(new StringBuilder("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*"), b(9), "#?");
    }

    private static String b(int i11) {
        return E.a(i11, "(\\p{Nd}{1,", "})");
    }

    static boolean d(String str) {
        return str.length() == 0 || f17625x.matcher(str).matches();
    }

    public static M8.a e(String str) {
        return new M8.a(str);
    }

    public static synchronized e g() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f17626y == null) {
                    P8.a b11 = O8.a.a().b();
                    if (b11 == null) {
                        throw new IllegalArgumentException("metadataLoader could not be null.");
                    }
                    e eVar2 = new e(new Q8.g(O8.a.a().d(), b11, O8.a.a().c()), M8.b.a());
                    synchronized (e.class) {
                        f17626y = eVar2;
                    }
                }
                eVar = f17626y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static String j(j jVar) {
        StringBuilder sb2 = new StringBuilder();
        if (jVar.e() && jVar.d() > 0) {
            char[] cArr = new char[jVar.d()];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(jVar.b());
        return sb2.toString();
    }

    static i k(g gVar, c cVar) {
        switch (a.f17636c[cVar.ordinal()]) {
            case 1:
                return gVar.u();
            case 2:
                return gVar.A();
            case 3:
                return gVar.j();
            case 4:
            case 5:
                return gVar.b();
            case 6:
                return gVar.y();
            case 7:
                return gVar.D();
            case 8:
                return gVar.s();
            case 9:
                return gVar.p();
            case 10:
                return gVar.B();
            case 11:
                return gVar.C();
            default:
                return gVar.d();
        }
    }

    private c l(String str, g gVar) {
        if (!n(str, gVar.d())) {
            return c.UNKNOWN;
        }
        if (n(str, gVar.u())) {
            return c.PREMIUM_RATE;
        }
        if (n(str, gVar.A())) {
            return c.TOLL_FREE;
        }
        if (n(str, gVar.y())) {
            return c.SHARED_COST;
        }
        if (n(str, gVar.D())) {
            return c.VOIP;
        }
        if (n(str, gVar.s())) {
            return c.PERSONAL_NUMBER;
        }
        if (n(str, gVar.p())) {
            return c.PAGER;
        }
        if (n(str, gVar.B())) {
            return c.UAN;
        }
        if (n(str, gVar.C())) {
            return c.VOICEMAIL;
        }
        if (!n(str, gVar.b())) {
            return (gVar.v() || !n(str, gVar.j())) ? c.UNKNOWN : c.MOBILE;
        }
        if (!gVar.v() && !n(str, gVar.j())) {
            return c.FIXED_LINE;
        }
        return c.FIXED_LINE_OR_MOBILE;
    }

    static void r(StringBuilder sb2) {
        if (f17622u.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), u(sb2, f17615n));
        } else {
            sb2.replace(0, sb2.length(), t(sb2));
        }
    }

    public static String s(String str) {
        return u(str, f17613l);
    }

    public static String t(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            int digit = Character.digit(charSequence.charAt(i11), 10);
            if (digit != -1) {
                sb2.append(digit);
            }
        }
        return sb2.toString();
    }

    private static String u(CharSequence charSequence, Map map) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            Character ch2 = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i11))));
            if (ch2 != null) {
                sb2.append(ch2);
            }
        }
        return sb2.toString();
    }

    private static d w(StringBuilder sb2, g gVar, c cVar) {
        i k11 = k(gVar, cVar);
        ArrayList e11 = k11.e().isEmpty() ? gVar.d().e() : k11.e();
        ArrayList f7 = k11.f();
        if (cVar == c.FIXED_LINE_OR_MOBILE) {
            i k12 = k(gVar, c.FIXED_LINE);
            if (k12.d() == 1 && k12.b() == -1) {
                return w(sb2, gVar, c.MOBILE);
            }
            i k13 = k(gVar, c.MOBILE);
            if (k13.d() != 1 || k13.b() != -1) {
                ArrayList arrayList = new ArrayList(e11);
                arrayList.addAll(k13.d() == 0 ? gVar.d().e() : k13.e());
                Collections.sort(arrayList);
                if (f7.isEmpty()) {
                    f7 = k13.f();
                } else {
                    ArrayList arrayList2 = new ArrayList(f7);
                    arrayList2.addAll(k13.f());
                    Collections.sort(arrayList2);
                    f7 = arrayList2;
                }
                e11 = arrayList;
            }
        }
        if (((Integer) e11.get(0)).intValue() == -1) {
            return d.INVALID_LENGTH;
        }
        int length = sb2.length();
        if (f7.contains(Integer.valueOf(length))) {
            return d.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) e11.get(0)).intValue();
        return intValue == length ? d.IS_POSSIBLE : intValue > length ? d.TOO_SHORT : ((Integer) e11.get(e11.size() - 1)).intValue() < length ? d.TOO_LONG : e11.subList(1, e11.size()).contains(Integer.valueOf(length)) ? d.IS_POSSIBLE : d.INVALID_LENGTH;
    }

    final int c(StringBuilder sb2, StringBuilder sb3) {
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            for (int i11 = 1; i11 <= 3 && i11 <= length; i11++) {
                int parseInt = Integer.parseInt(sb2.substring(0, i11));
                if (this.f17628b.containsKey(Integer.valueOf(parseInt))) {
                    sb3.append(sb2.substring(i11));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        if (str != null && this.f17632f.contains(str)) {
            g i11 = i(str);
            if (i11 != null) {
                return i11.a();
            }
            throw new IllegalArgumentException(Nk.a.b("Invalid region code: ", str));
        }
        Level level = Level.WARNING;
        StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        f17609h.log(level, o0.c(sb2, str, ") provided."));
        return 0;
    }

    final g h(int i11) {
        if (!this.f17633g.contains(Integer.valueOf(i11))) {
            return null;
        }
        g a11 = this.f17627a.a(i11);
        String a12 = Ej.b.a(i11, "Missing metadata for country code ");
        if (a11 != null) {
            return a11;
        }
        throw new M8.c(a12);
    }

    final g i(String str) {
        if (str == null || !this.f17632f.contains(str)) {
            return null;
        }
        g b11 = this.f17627a.b(str);
        String concat = "Missing metadata for region code ".concat(str);
        if (b11 != null) {
            return b11;
        }
        throw new M8.c(concat);
    }

    public final String m(int i11) {
        List list = (List) this.f17628b.get(Integer.valueOf(i11));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    final boolean n(String str, i iVar) {
        int length = str.length();
        ArrayList e11 = iVar.e();
        if (e11.size() <= 0 || e11.contains(Integer.valueOf(length))) {
            return this.f17629c.b(str, iVar);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (r0 != r1.a()) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(j jVar) {
        int a11 = jVar.a();
        List<String> list = (List) this.f17628b.get(Integer.valueOf(a11));
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String j11 = j(jVar);
                for (String str2 : list) {
                    g i11 = i(str2);
                    if (!i11.E()) {
                        if (l(j11, i11) != c.UNKNOWN) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.f17631e.a(i11.i()).matcher(j11).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = (String) list.get(0);
            }
        } else {
            f17609h.log(Level.INFO, E.a(a11, "Missing/invalid country_code (", ")"));
        }
        int a12 = jVar.a();
        g h11 = "001".equals(str) ? h(a12) : i(str);
        if (h11 != null) {
            if (!"001".equals(str)) {
                g i12 = i(str);
                if (i12 == null) {
                    throw new IllegalArgumentException(Nk.a.b("Invalid region code: ", str));
                }
            }
            if (l(j(jVar), h11) != c.UNKNOWN) {
                return true;
            }
        }
        return false;
    }

    final int p(CharSequence charSequence, g gVar, StringBuilder sb2, j jVar) throws M8.d {
        j.a aVar;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb3 = new StringBuilder(charSequence);
        String f7 = gVar != null ? gVar.f() : "NonMatch";
        if (sb3.length() == 0) {
            aVar = j.a.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = f17617p.matcher(sb3);
            if (matcher.lookingAt()) {
                sb3.delete(0, matcher.end());
                r(sb3);
                aVar = j.a.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern a11 = this.f17631e.a(f7);
                r(sb3);
                Matcher matcher2 = a11.matcher(sb3);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = f17618q.matcher(sb3.substring(end));
                    if (!matcher3.find() || !t(matcher3.group(1)).equals("0")) {
                        sb3.delete(0, end);
                        aVar = j.a.FROM_NUMBER_WITH_IDD;
                    }
                }
                aVar = j.a.FROM_DEFAULT_COUNTRY;
            }
        }
        if (aVar != j.a.FROM_DEFAULT_COUNTRY) {
            if (sb3.length() <= 2) {
                throw new M8.d(d.a.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int c11 = c(sb3, sb2);
            if (c11 == 0) {
                throw new M8.d(d.a.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            jVar.f(c11);
            return c11;
        }
        if (gVar != null) {
            int a12 = gVar.a();
            String valueOf = String.valueOf(a12);
            String sb4 = sb3.toString();
            if (sb4.startsWith(valueOf)) {
                StringBuilder sb5 = new StringBuilder(sb4.substring(valueOf.length()));
                i d11 = gVar.d();
                q(sb5, gVar, null);
                N8.a aVar2 = this.f17629c;
                if ((!aVar2.b(sb3, d11) && aVar2.b(sb5, d11)) || w(sb3, gVar, c.UNKNOWN) == d.TOO_LONG) {
                    sb2.append((CharSequence) sb5);
                    jVar.f(a12);
                    return a12;
                }
            }
        }
        jVar.f(0);
        return 0;
    }

    final void q(StringBuilder sb2, g gVar, StringBuilder sb3) {
        int length = sb2.length();
        String l11 = gVar.l();
        if (length == 0 || l11.length() == 0) {
            return;
        }
        Matcher matcher = this.f17631e.a(l11).matcher(sb2);
        if (matcher.lookingAt()) {
            i d11 = gVar.d();
            N8.a aVar = this.f17629c;
            boolean b11 = aVar.b(sb2, d11);
            int groupCount = matcher.groupCount();
            String m11 = gVar.m();
            if (m11 == null || m11.length() == 0 || matcher.group(groupCount) == null) {
                if (!b11 || aVar.b(sb2.substring(matcher.end()), d11)) {
                    if (sb3 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder(sb2);
            sb4.replace(0, length, matcher.replaceFirst(m11));
            if (!b11 || aVar.b(sb4.toString(), d11)) {
                if (sb3 != null && groupCount > 1) {
                    sb3.append(matcher.group(1));
                }
                sb2.replace(0, sb2.length(), sb4.toString());
            }
        }
    }

    public final void v(String str, String str2, j jVar) throws M8.d {
        CharSequence charSequence;
        int p11;
        if (str == null) {
            throw new M8.d(d.a.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new M8.d(d.a.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String str3 = str.toString();
        int indexOf = str3.indexOf(";phone-context=");
        String str4 = "";
        if (indexOf >= 0) {
            int i11 = indexOf + 15;
            if (i11 < str3.length() - 1 && str3.charAt(i11) == '+') {
                int indexOf2 = str3.indexOf(59, i11);
                if (indexOf2 > 0) {
                    sb2.append(str3.substring(i11, indexOf2));
                } else {
                    sb2.append(str3.substring(i11));
                }
            }
            int indexOf3 = str3.indexOf("tel:");
            sb2.append(str3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            Matcher matcher = f17619r.matcher(str3);
            if (matcher.find()) {
                charSequence = str3.subSequence(matcher.start(), str3.length());
                Matcher matcher2 = f17621t.matcher(charSequence);
                if (matcher2.find()) {
                    charSequence = charSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = f17620s.matcher(charSequence);
                if (matcher3.find()) {
                    charSequence = charSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequence = "";
            }
            sb2.append(charSequence);
        }
        int indexOf4 = sb2.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb2.delete(indexOf4, sb2.length());
        }
        int length = sb2.length();
        Pattern pattern = f17624w;
        if (!(length < 2 ? false : pattern.matcher(sb2).matches())) {
            throw new M8.d(d.a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        boolean z11 = str2 != null && this.f17632f.contains(str2);
        Pattern pattern2 = f17617p;
        if (!z11 && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
            throw new M8.d(d.a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        Matcher matcher4 = f17623v.matcher(sb2);
        if (matcher4.find()) {
            String substring = sb2.substring(0, matcher4.start());
            if (substring.length() < 2 ? false : pattern.matcher(substring).matches()) {
                int groupCount = matcher4.groupCount();
                int i12 = 1;
                while (true) {
                    if (i12 > groupCount) {
                        break;
                    }
                    if (matcher4.group(i12) != null) {
                        str4 = matcher4.group(i12);
                        sb2.delete(matcher4.start(), sb2.length());
                        break;
                    }
                    i12++;
                }
            }
        }
        if (str4.length() > 0) {
            jVar.g(str4);
        }
        g i13 = i(str2);
        StringBuilder sb3 = new StringBuilder();
        try {
            p11 = p(sb2, i13, sb3, jVar);
        } catch (M8.d e11) {
            Matcher matcher5 = pattern2.matcher(sb2);
            if (e11.a() != d.a.INVALID_COUNTRY_CODE || !matcher5.lookingAt()) {
                throw new M8.d(e11.a(), e11.getMessage());
            }
            p11 = p(sb2.substring(matcher5.end()), i13, sb3, jVar);
            if (p11 == 0) {
                throw new M8.d(d.a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (p11 != 0) {
            String m11 = m(p11);
            if (!m11.equals(str2)) {
                i13 = "001".equals(m11) ? h(p11) : i(m11);
            }
        } else {
            r(sb2);
            sb3.append((CharSequence) sb2);
            if (str2 != null) {
                jVar.f(i13.a());
            }
        }
        if (sb3.length() < 2) {
            throw new M8.d(d.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (i13 != null) {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder(sb3);
            q(sb5, i13, sb4);
            d w11 = w(sb5, i13, c.UNKNOWN);
            if (w11 != d.TOO_SHORT && w11 != d.IS_POSSIBLE_LOCAL_ONLY && w11 != d.INVALID_LENGTH) {
                sb3 = sb5;
            }
        }
        int length2 = sb3.length();
        if (length2 < 2) {
            throw new M8.d(d.a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new M8.d(d.a.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb3.length() > 1 && sb3.charAt(0) == '0') {
            jVar.h();
            int i14 = 1;
            while (i14 < sb3.length() - 1 && sb3.charAt(i14) == '0') {
                i14++;
            }
            if (i14 != 1) {
                jVar.j(i14);
            }
        }
        jVar.i(Long.parseLong(sb3.toString()));
    }
}
