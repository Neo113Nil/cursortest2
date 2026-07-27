package io.appmetrica.analytics.coreapi.internal.data;

import e5.g;
import f4.C0431h;

/* loaded from: classes.dex */
public interface Parser<IN, OUT> {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <IN, OUT> OUT parseOrNull(Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                out = parser.parse(in);
            } catch (Throwable th) {
                out = (OUT) g.l(th);
            }
            if (out instanceof C0431h) {
                return null;
            }
            return out;
        }
    }

    OUT parse(IN in);

    OUT parseOrNull(IN in);
}
