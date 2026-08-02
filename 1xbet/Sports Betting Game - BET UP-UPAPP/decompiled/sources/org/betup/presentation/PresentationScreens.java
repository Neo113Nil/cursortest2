package org.betup.presentation;

import androidx.fragment.app.Fragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.protocol.Request;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationScreens.kt */
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\b\u001a\u00020\tJ(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lorg/betup/presentation/PresentationScreens;", "", "registryStore", "Lorg/betup/presentation/PresentationScreenRegistryStore;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/presentation/PresentationScreenRegistryStore;)V", "resolve", "", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "resolveContext", "", "normalizeContext", "raw", "keyFromClassName", "className", "shouldTrack", "", "matchesCampaignScreen", "campaignScreenKey", "activeScreenKey", "camelCaseToSnakeCase", "value", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationScreens {
    public static final String UNKNOWN = "unknown";
    private final PresentationScreenRegistryStore registryStore;
    public static final int $stable = 8;

    @Inject
    public PresentationScreens(PresentationScreenRegistryStore registryStore) {
        Intrinsics.checkNotNullParameter(registryStore, "registryStore");
        this.registryStore = registryStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String resolve(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof PresentationScreenProvider) {
            String obj = StringsKt.trim((CharSequence) ((PresentationScreenProvider) fragment).presentationScreenKey()).toString();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = obj.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        String simpleName = fragment.getClass().getSimpleName();
        PresentationScreenRegistryStore presentationScreenRegistryStore = this.registryStore;
        Intrinsics.checkNotNull(simpleName);
        String resolveClassName = presentationScreenRegistryStore.resolveClassName(simpleName);
        if (resolveClassName != null && !StringsKt.isBlank(resolveClassName)) {
            String obj2 = StringsKt.trim((CharSequence) resolveClassName).toString();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = obj2.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return lowerCase2;
        }
        return keyFromClassName(simpleName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> resolveContext(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return !(fragment instanceof PresentationScreenProvider) ? MapsKt.emptyMap() : normalizeContext(((PresentationScreenProvider) fragment).presentationScreenContext());
    }

    public final Map<String, String> normalizeContext(Map<String, String> raw) {
        if (raw == null || raw.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : raw.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String obj = StringsKt.trim((CharSequence) key).toString();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = obj.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String obj2 = StringsKt.trim((CharSequence) value).toString();
            if (lowerCase.length() != 0 && obj2.length() != 0) {
                linkedHashMap.put(lowerCase, obj2);
            }
        }
        return linkedHashMap;
    }

    public final String keyFromClassName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        String str = className;
        if (StringsKt.isBlank(str)) {
            return "unknown";
        }
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (StringsKt.endsWith$default(obj, "FragmentK", false, 2, (Object) null)) {
            obj = StringsKt.removeSuffix(obj, (CharSequence) "K");
        }
        if (StringsKt.endsWith$default(obj, "DialogFragment", false, 2, (Object) null)) {
            obj = StringsKt.removeSuffix(obj, (CharSequence) "DialogFragment");
        } else if (StringsKt.endsWith$default(obj, "Fragment", false, 2, (Object) null)) {
            obj = StringsKt.removeSuffix(obj, (CharSequence) "Fragment");
        } else if (StringsKt.endsWith$default(obj, "Dialog", false, 2, (Object) null)) {
            obj = StringsKt.removeSuffix(obj, (CharSequence) "Dialog");
        }
        String camelCaseToSnakeCase = camelCaseToSnakeCase(obj);
        return StringsKt.isBlank(camelCaseToSnakeCase) ? "unknown" : camelCaseToSnakeCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean shouldTrack(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if ((fragment instanceof PresentationScreenProvider) && !((PresentationScreenProvider) fragment).shouldReportPresentationScreen()) {
            return false;
        }
        PresentationScreenRegistryStore presentationScreenRegistryStore = this.registryStore;
        Intrinsics.checkNotNullExpressionValue(fragment.getClass().getSimpleName(), "getSimpleName(...)");
        return !presentationScreenRegistryStore.isIgnoredClassName(r3);
    }

    public final boolean matchesCampaignScreen(String campaignScreenKey, String activeScreenKey) {
        Intrinsics.checkNotNullParameter(campaignScreenKey, "campaignScreenKey");
        Intrinsics.checkNotNullParameter(activeScreenKey, "activeScreenKey");
        return this.registryStore.matchesCampaignScreen(campaignScreenKey, activeScreenKey);
    }

    public final String camelCaseToSnakeCase(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String replace = new Regex("([A-Z])([A-Z][a-z])").replace(new Regex("([a-z0-9])([A-Z])").replace(value, "$1_$2"), "$1_$2");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = replace.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
