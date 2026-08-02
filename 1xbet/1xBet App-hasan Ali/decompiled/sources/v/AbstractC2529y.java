package v;

import java.io.IOException;

/* renamed from: v.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2529y {
    public static final void a(long j5, x.P p5) {
        if (p5 == x.P.f20695k) {
            if (W0.a.g(j5) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (W0.a.h(j5) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static y4.v c(String str) {
        if (str.equals("http/1.0")) {
            return y4.v.f21427l;
        }
        if (str.equals("http/1.1")) {
            return y4.v.f21428m;
        }
        if (str.equals("h2_prior_knowledge")) {
            return y4.v.f21431p;
        }
        if (str.equals("h2")) {
            return y4.v.f21430o;
        }
        if (str.equals("spdy/3.1")) {
            return y4.v.f21429n;
        }
        if (str.equals("quic")) {
            return y4.v.f21432q;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public abstract boolean b(y0.g gVar);

    public abstract Object d(y0.g gVar);
}
