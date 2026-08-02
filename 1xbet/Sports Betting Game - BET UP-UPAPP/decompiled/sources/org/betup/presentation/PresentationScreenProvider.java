package org.betup.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

/* compiled from: PresentationScreenProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/betup/presentation/PresentationScreenProvider;", "", "presentationScreenKey", "", "shouldReportPresentationScreen", "", "presentationScreenContext", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PresentationScreenProvider {
    Map<String, String> presentationScreenContext();

    String presentationScreenKey();

    boolean shouldReportPresentationScreen();

    /* compiled from: PresentationScreenProvider.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean shouldReportPresentationScreen(PresentationScreenProvider presentationScreenProvider) {
            return true;
        }

        public static Map<String, String> presentationScreenContext(PresentationScreenProvider presentationScreenProvider) {
            return MapsKt.emptyMap();
        }
    }
}
