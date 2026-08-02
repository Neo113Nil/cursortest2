package N3;

import b4.C5529e;
import b4.C5534j;
import j3.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18465c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f18466a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f18467b = -1;

    private boolean a(String str) {
        Matcher matcher = f18465c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i11 = m3.N.f74289a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f18466a = parseInt;
            this.f18467b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(j3.t tVar) {
        for (int i11 = 0; i11 < tVar.e(); i11++) {
            t.a d11 = tVar.d(i11);
            if (d11 instanceof C5529e) {
                C5529e c5529e = (C5529e) d11;
                if ("iTunSMPB".equals(c5529e.f55501c) && a(c5529e.f55502d)) {
                    return;
                }
            } else if (d11 instanceof C5534j) {
                C5534j c5534j = (C5534j) d11;
                if ("com.apple.iTunes".equals(c5534j.f55514b) && "iTunSMPB".equals(c5534j.f55515c) && a(c5534j.f55516d)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
