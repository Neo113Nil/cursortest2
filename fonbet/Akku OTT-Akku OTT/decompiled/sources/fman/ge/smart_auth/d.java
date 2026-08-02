package fman.ge.smart_auth;

import io.flutter.plugin.common.MessageCodec;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public interface d {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Lazy<g> b = LazyKt.lazy(new c(0));

        public static MessageCodec a() {
            return b.getValue();
        }
    }
}
