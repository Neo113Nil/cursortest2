package Ef;

import Ef.h;
import Hf.AbstractC3139b;
import Hf.w;
import Jf.AbstractC3395a;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class k extends AbstractC3395a {

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern[][] f7910e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: b, reason: collision with root package name */
    private final Pattern f7912b;

    /* renamed from: a, reason: collision with root package name */
    private final Hf.m f7911a = new Hf.m();

    /* renamed from: c, reason: collision with root package name */
    private boolean f7913c = false;

    /* renamed from: d, reason: collision with root package name */
    private Ef.a f7914d = new Ef.a();

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            int o11 = hVar.o();
            CharSequence n11 = hVar.n();
            if (hVar.l() >= 4 || n11.charAt(o11) != '<') {
                return null;
            }
            for (int i11 = 1; i11 <= 7; i11++) {
                if (i11 != 7 || !(((h.a) eVar).b().e() instanceof w)) {
                    Pattern pattern = k.f7910e[i11][0];
                    Pattern pattern2 = k.f7910e[i11][1];
                    if (pattern.matcher(n11.subSequence(o11, n11.length())).find()) {
                        d g10 = d.g(new k(pattern2));
                        g10.b(hVar.m());
                        return g10;
                    }
                }
            }
            return null;
        }
    }

    k(Pattern pattern) {
        this.f7912b = pattern;
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7911a;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void f(CharSequence charSequence) {
        this.f7914d.a(charSequence);
        Pattern pattern = this.f7912b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f7913c = true;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void g() {
        this.f7914d.getClass();
        this.f7911a.getClass();
        this.f7914d = null;
    }

    @Override // Jf.c
    public final b h(h hVar) {
        if (this.f7913c) {
            return null;
        }
        if (hVar.q() && this.f7912b == null) {
            return null;
        }
        return b.a(hVar.m());
    }
}
