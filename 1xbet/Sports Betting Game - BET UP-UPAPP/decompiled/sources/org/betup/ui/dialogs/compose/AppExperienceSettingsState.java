package org.betup.ui.dialogs.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AppExperienceSettingsState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/dialogs/compose/AppExperienceSettingsState;", "", "visualEffectsEnabled", "", "hapticFeedbackEnabled", "inAppMessagesEnabled", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZZ)V", "getVisualEffectsEnabled", "()Z", "getHapticFeedbackEnabled", "getInAppMessagesEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppExperienceSettingsState {
    public static final int $stable = 0;
    private final boolean hapticFeedbackEnabled;
    private final boolean inAppMessagesEnabled;
    private final boolean visualEffectsEnabled;

    public AppExperienceSettingsState() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ AppExperienceSettingsState copy$default(AppExperienceSettingsState appExperienceSettingsState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appExperienceSettingsState.visualEffectsEnabled;
        }
        if ((i & 2) != 0) {
            z2 = appExperienceSettingsState.hapticFeedbackEnabled;
        }
        if ((i & 4) != 0) {
            z3 = appExperienceSettingsState.inAppMessagesEnabled;
        }
        return appExperienceSettingsState.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisualEffectsEnabled() {
        return this.visualEffectsEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInAppMessagesEnabled() {
        return this.inAppMessagesEnabled;
    }

    public final AppExperienceSettingsState copy(boolean visualEffectsEnabled, boolean hapticFeedbackEnabled, boolean inAppMessagesEnabled) {
        return new AppExperienceSettingsState(visualEffectsEnabled, hapticFeedbackEnabled, inAppMessagesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppExperienceSettingsState)) {
            return false;
        }
        AppExperienceSettingsState appExperienceSettingsState = (AppExperienceSettingsState) other;
        return this.visualEffectsEnabled == appExperienceSettingsState.visualEffectsEnabled && this.hapticFeedbackEnabled == appExperienceSettingsState.hapticFeedbackEnabled && this.inAppMessagesEnabled == appExperienceSettingsState.inAppMessagesEnabled;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.visualEffectsEnabled) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled)) * 31) + Boolean.hashCode(this.inAppMessagesEnabled);
    }

    public String toString() {
        return "AppExperienceSettingsState(visualEffectsEnabled=" + this.visualEffectsEnabled + ", hapticFeedbackEnabled=" + this.hapticFeedbackEnabled + ", inAppMessagesEnabled=" + this.inAppMessagesEnabled + ")";
    }

    public AppExperienceSettingsState(boolean z, boolean z2, boolean z3) {
        this.visualEffectsEnabled = z;
        this.hapticFeedbackEnabled = z2;
        this.inAppMessagesEnabled = z3;
    }

    public /* synthetic */ AppExperienceSettingsState(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public final boolean getVisualEffectsEnabled() {
        return this.visualEffectsEnabled;
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    public final boolean getInAppMessagesEnabled() {
        return this.inAppMessagesEnabled;
    }
}
