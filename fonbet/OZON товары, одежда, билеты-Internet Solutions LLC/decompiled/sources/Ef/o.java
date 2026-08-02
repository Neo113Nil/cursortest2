package Ef;

import java.util.ArrayList;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f7945d;

    /* renamed from: e, reason: collision with root package name */
    private String f7946e;

    /* renamed from: f, reason: collision with root package name */
    private String f7947f;

    /* renamed from: g, reason: collision with root package name */
    private char f7948g;

    /* renamed from: h, reason: collision with root package name */
    private StringBuilder f7949h;

    /* renamed from: a, reason: collision with root package name */
    private b f7942a = b.START_DEFINITION;

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f7943b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f7944c = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f7950i = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7951a;

        static {
            int[] iArr = new int[b.values().length];
            f7951a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7951a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7951a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7951a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7951a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7951a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DESTINATION;
        public static final b LABEL;
        public static final b PARAGRAPH;
        public static final b START_DEFINITION;
        public static final b START_TITLE;
        public static final b TITLE;

        static {
            b bVar = new b("START_DEFINITION", 0);
            START_DEFINITION = bVar;
            b bVar2 = new b("LABEL", 1);
            LABEL = bVar2;
            b bVar3 = new b("DESTINATION", 2);
            DESTINATION = bVar3;
            b bVar4 = new b("START_TITLE", 3);
            START_TITLE = bVar4;
            b bVar5 = new b(SelectionItemDescriptionDTO.TITLE, 4);
            TITLE = bVar5;
            b bVar6 = new b("PARAGRAPH", 5);
            PARAGRAPH = bVar6;
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

    private void a() {
        if (this.f7950i) {
            String c11 = Gf.a.c(this.f7947f);
            StringBuilder sb2 = this.f7949h;
            this.f7944c.add(new Hf.r(this.f7946e, c11, sb2 != null ? Gf.a.c(sb2.toString()) : null));
            this.f7945d = null;
            this.f7950i = false;
            this.f7946e = null;
            this.f7947f = null;
            this.f7949h = null;
        }
    }

    final ArrayList b() {
        a();
        return this.f7944c;
    }

    final StringBuilder c() {
        return this.f7943b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        if (r3 == r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:5:0x0012->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(CharSequence charSequence) {
        int d11;
        int i11;
        StringBuilder sb2 = this.f7943b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i12 = 0;
        while (i12 < charSequence.length()) {
            switch (a.f7951a[this.f7942a.ordinal()]) {
                case 1:
                    break;
                case 2:
                    int k11 = Gf.d.k(i12, charSequence.length(), charSequence);
                    if (k11 < charSequence.length() && charSequence.charAt(k11) == '[') {
                        this.f7942a = b.LABEL;
                        this.f7945d = new StringBuilder();
                        i12 = k11 + 1;
                        if (i12 >= charSequence.length()) {
                            this.f7945d.append('\n');
                        }
                        if (i12 != -1) {
                            this.f7942a = b.PARAGRAPH;
                            break;
                        }
                    }
                    i12 = -1;
                    if (i12 != -1) {
                    }
                    break;
                case 3:
                    d11 = Gf.c.d(i12, charSequence);
                    if (d11 != -1) {
                        this.f7945d.append(charSequence, i12, d11);
                        if (d11 >= charSequence.length()) {
                            this.f7945d.append('\n');
                            i12 = d11;
                            if (i12 != -1) {
                            }
                        } else if (charSequence.charAt(d11) == ']' && (i11 = d11 + 1) < charSequence.length() && charSequence.charAt(i11) == ':' && this.f7945d.length() <= 999) {
                            String a11 = Gf.a.a(this.f7945d.toString());
                            if (!a11.isEmpty()) {
                                this.f7946e = a11;
                                this.f7942a = b.DESTINATION;
                                i12 = Gf.d.k(d11 + 2, charSequence.length(), charSequence);
                                if (i12 != -1) {
                                }
                            }
                        }
                    }
                    i12 = -1;
                    if (i12 != -1) {
                    }
                    break;
                case 4:
                    int k12 = Gf.d.k(i12, charSequence.length(), charSequence);
                    int c11 = Gf.c.c(k12, charSequence);
                    if (c11 != -1) {
                        this.f7947f = charSequence.charAt(k12) == '<' ? charSequence.subSequence(k12 + 1, c11 - 1).toString() : charSequence.subSequence(k12, c11).toString();
                        i12 = Gf.d.k(c11, charSequence.length(), charSequence);
                        if (i12 >= charSequence.length()) {
                            this.f7950i = true;
                            sb2.setLength(0);
                        }
                        this.f7942a = b.START_TITLE;
                        if (i12 != -1) {
                        }
                    }
                    i12 = -1;
                    if (i12 != -1) {
                    }
                    break;
                case 5:
                    i12 = Gf.d.k(i12, charSequence.length(), charSequence);
                    if (i12 >= charSequence.length()) {
                        this.f7942a = b.START_DEFINITION;
                    } else {
                        this.f7948g = (char) 0;
                        char charAt = charSequence.charAt(i12);
                        if (charAt == '\"' || charAt == '\'') {
                            this.f7948g = charAt;
                        } else if (charAt == '(') {
                            this.f7948g = ')';
                        }
                        if (this.f7948g != 0) {
                            this.f7942a = b.TITLE;
                            this.f7949h = new StringBuilder();
                            i12++;
                            if (i12 == charSequence.length()) {
                                this.f7949h.append('\n');
                            }
                        } else {
                            a();
                            this.f7942a = b.START_DEFINITION;
                        }
                    }
                    if (i12 != -1) {
                    }
                    break;
                case 6:
                    d11 = Gf.c.f(charSequence, i12, this.f7948g);
                    if (d11 != -1) {
                        this.f7949h.append(charSequence.subSequence(i12, d11));
                        if (d11 >= charSequence.length()) {
                            this.f7949h.append('\n');
                            i12 = d11;
                            if (i12 != -1) {
                            }
                        } else {
                            i12 = Gf.d.k(d11 + 1, charSequence.length(), charSequence);
                            if (i12 == charSequence.length()) {
                                this.f7950i = true;
                                a();
                                sb2.setLength(0);
                                this.f7942a = b.START_DEFINITION;
                                if (i12 != -1) {
                                }
                            }
                        }
                    }
                    i12 = -1;
                    if (i12 != -1) {
                    }
                    break;
                default:
                    if (i12 != -1) {
                    }
                    break;
            }
            return;
        }
    }
}
