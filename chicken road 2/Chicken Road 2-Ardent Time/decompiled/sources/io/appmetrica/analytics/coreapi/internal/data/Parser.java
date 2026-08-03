package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface Parser<IN, OUT> {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <IN, OUT> OUT parseOrNull(io.appmetrica.analytics.coreapi.internal.data.Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                out = parser.parse(in);
            } catch (java.lang.Throwable th) {
                out = (OUT) a.AbstractC0059a.i(th);
            }
            if (out instanceof h1.C0173e) {
                return null;
            }
            return out;
        }
    }

    OUT parse(IN in);

    OUT parseOrNull(IN in);
}
