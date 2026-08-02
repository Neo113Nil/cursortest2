package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.text.p;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final o f42190d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f42191e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f42192f;

    /* renamed from: g, reason: collision with root package name */
    static final a f42193g;

    /* renamed from: h, reason: collision with root package name */
    static final a f42194h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f42195i = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42196a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42197b;

    /* renamed from: c, reason: collision with root package name */
    private final o f42198c;

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0772a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f42199a;

        /* renamed from: b, reason: collision with root package name */
        private int f42200b;

        /* renamed from: c, reason: collision with root package name */
        private o f42201c;

        public C0772a() {
            this.f42199a = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            this.f42201c = a.f42190d;
            this.f42200b = 2;
        }

        public final a a() {
            return (this.f42200b == 2 && this.f42201c == a.f42190d) ? this.f42199a ? a.f42194h : a.f42193g : new a(this.f42199a, this.f42200b, this.f42201c);
        }
    }

    private static class b {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f42202e = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f42203a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42204b;

        /* renamed from: c, reason: collision with root package name */
        private int f42205c;

        /* renamed from: d, reason: collision with root package name */
        private char f42206d;

        static {
            for (int i11 = 0; i11 < 1792; i11++) {
                f42202e[i11] = Character.getDirectionality(i11);
            }
        }

        b(CharSequence charSequence) {
            this.f42203a = charSequence;
            this.f42204b = charSequence.length();
        }

        final byte a() {
            int i11 = this.f42205c - 1;
            CharSequence charSequence = this.f42203a;
            char charAt = charSequence.charAt(i11);
            this.f42206d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f42205c);
                this.f42205c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f42205c--;
            char c11 = this.f42206d;
            return c11 < 1792 ? f42202e[c11] : Character.getDirectionality(c11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
        
            if (r1 != 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
        
            if (r2 == 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
        
            if (r9.f42205c <= 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:
        
            switch(a()) {
                case 14: goto L66;
                case 15: goto L66;
                case 16: goto L65;
                case 17: goto L65;
                case 18: goto L64;
                default: goto L70;
            };
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
        
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x007e, code lost:
        
            if (r1 != r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0081, code lost:
        
            r3 = r3 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0084, code lost:
        
            if (r1 != r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0087, code lost:
        
            return 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int b() {
            byte directionality;
            this.f42205c = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f42205c;
                if (i14 < this.f42204b && i11 == 0) {
                    CharSequence charSequence = this.f42203a;
                    char charAt = charSequence.charAt(i14);
                    this.f42206d = charAt;
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, this.f42205c);
                        this.f42205c = Character.charCount(codePointAt) + this.f42205c;
                        directionality = Character.getDirectionality(codePointAt);
                    } else {
                        this.f42205c++;
                        char c11 = this.f42206d;
                        directionality = c11 < 1792 ? f42202e[c11] : Character.getDirectionality(c11);
                    }
                    if (directionality != 0) {
                        if (directionality == 1 || directionality == 2) {
                            if (i13 == 0) {
                            }
                        } else if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i13++;
                                    i12 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i13++;
                                    i12 = 1;
                                    continue;
                                case 18:
                                    i13--;
                                    i12 = 0;
                                    continue;
                            }
                        }
                    } else if (i13 == 0) {
                    }
                    i11 = i13;
                }
            }
            return -1;
        }

        final int c() {
            this.f42205c = this.f42204b;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                while (this.f42205c > 0) {
                    byte a11 = a();
                    if (a11 != 0) {
                        if (a11 == 1 || a11 == 2) {
                            if (i11 == 0) {
                                return 1;
                            }
                            if (i12 == 0) {
                                break;
                            }
                        } else if (a11 != 9) {
                            switch (a11) {
                                case 14:
                                case 15:
                                    if (i12 == i11) {
                                        return -1;
                                    }
                                    i11--;
                                    break;
                                case 16:
                                case 17:
                                    if (i12 == i11) {
                                        return 1;
                                    }
                                    i11--;
                                    break;
                                case 18:
                                    i11++;
                                    break;
                                default:
                                    if (i12 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i11 == 0) {
                            return -1;
                        }
                        if (i12 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        o oVar = p.f42221c;
        f42190d = oVar;
        f42191e = Character.toString((char) 8206);
        f42192f = Character.toString((char) 8207);
        f42193g = new a(false, 2, oVar);
        f42194h = new a(true, 2, oVar);
    }

    a(boolean z11, int i11, o oVar) {
        this.f42196a = z11;
        this.f42197b = i11;
        this.f42198c = oVar;
    }

    public final String a(String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (str == null) {
            return null;
        }
        o oVar = this.f42198c;
        if (str == null) {
            spannableStringBuilder = null;
        } else {
            boolean a11 = ((p.b) oVar).a(str.length(), str);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            int i11 = this.f42197b & 2;
            String str2 = "";
            String str3 = f42192f;
            String str4 = f42191e;
            boolean z11 = this.f42196a;
            if (i11 != 0) {
                boolean a12 = ((p.b) (a11 ? p.f42220b : p.f42219a)).a(str.length(), str);
                spannableStringBuilder2.append((CharSequence) ((z11 || !(a12 || new b(str).b() == 1)) ? (!z11 || (a12 && new b(str).b() != -1)) ? "" : str3 : str4));
            }
            if (a11 != z11) {
                spannableStringBuilder2.append(a11 ? (char) 8235 : (char) 8234);
                spannableStringBuilder2.append((CharSequence) str);
                spannableStringBuilder2.append((char) 8236);
            } else {
                spannableStringBuilder2.append((CharSequence) str);
            }
            boolean a13 = ((p.b) (a11 ? p.f42220b : p.f42219a)).a(str.length(), str);
            if (!z11 && (a13 || new b(str).c() == 1)) {
                str2 = str4;
            } else if (z11 && (!a13 || new b(str).c() == -1)) {
                str2 = str3;
            }
            spannableStringBuilder2.append((CharSequence) str2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        return spannableStringBuilder.toString();
    }
}
