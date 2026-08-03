package com.facebook.internal.logging.dumpsys;

/* compiled from: EndToEndDumper.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH&¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumper;", "", "maybeDump", "", "prefix", "", "writer", "Ljava/io/PrintWriter;", "args", "", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface EndToEndDumper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.logging.dumpsys.EndToEndDumper.Companion INSTANCE = com.facebook.internal.logging.dumpsys.EndToEndDumper.Companion.$$INSTANCE;

    boolean maybeDump(java.lang.String prefix, java.io.PrintWriter writer, java.lang.String[] args);

    /* compiled from: EndToEndDumper.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumper$Companion;", "", "()V", com.ironsource.C3232q2.p, "Lcom/facebook/internal/logging/dumpsys/EndToEndDumper;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "()Lcom/facebook/internal/logging/dumpsys/EndToEndDumper;", "setInstance", "(Lcom/facebook/internal/logging/dumpsys/EndToEndDumper;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.facebook.internal.logging.dumpsys.EndToEndDumper.Companion $$INSTANCE = new com.facebook.internal.logging.dumpsys.EndToEndDumper.Companion();
        private static com.facebook.internal.logging.dumpsys.EndToEndDumper instance;

        private Companion() {
        }

        public final com.facebook.internal.logging.dumpsys.EndToEndDumper getInstance() {
            return instance;
        }

        public final void setInstance(com.facebook.internal.logging.dumpsys.EndToEndDumper endToEndDumper) {
            instance = endToEndDumper;
        }
    }
}
