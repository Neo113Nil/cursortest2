package org.betup.model.remote.api.rest.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GetActivePresentationsInteractor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lorg/betup/model/remote/api/rest/presentation/PresentationEligibilityContext;", "", "screenKey", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getScreenKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PresentationEligibilityContext {
    public static final int $stable = 0;
    private final String screenKey;

    public static /* synthetic */ PresentationEligibilityContext copy$default(PresentationEligibilityContext presentationEligibilityContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentationEligibilityContext.screenKey;
        }
        return presentationEligibilityContext.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    public final PresentationEligibilityContext copy(String screenKey) {
        return new PresentationEligibilityContext(screenKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PresentationEligibilityContext) && Intrinsics.areEqual(this.screenKey, ((PresentationEligibilityContext) other).screenKey);
    }

    public int hashCode() {
        String str = this.screenKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "PresentationEligibilityContext(screenKey=" + this.screenKey + ")";
    }

    public PresentationEligibilityContext(String str) {
        this.screenKey = str;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }
}
