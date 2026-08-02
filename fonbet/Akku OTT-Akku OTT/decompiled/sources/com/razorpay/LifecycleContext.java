package com.razorpay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/razorpay/LifecycleContext;", "", "contextTemplate", "", "(Ljava/lang/String;ILjava/lang/String;)V", "format", "tokenName", "value", "getTemplate", "REDIRECTING_TO_APP", "REDIRECTING_USING_SCHEME", "Companion", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Keep
@KeepClassMembers
/* loaded from: classes4.dex */
public enum LifecycleContext {
    REDIRECTING_TO_APP("Redirecting to {package_name} app."),
    REDIRECTING_USING_SCHEME("Redirecting using {scheme} scheme.");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contextTemplate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/razorpay/LifecycleContext$Companion;", "", "()V", "redirectingToApp", "", "packageName", "redirectingUsingScheme", "scheme", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final String redirectingToApp(String packageName) {
            return LifecycleContext.REDIRECTING_TO_APP.format("package_name", packageName);
        }

        @JvmStatic
        public final String redirectingUsingScheme(String scheme) {
            return LifecycleContext.REDIRECTING_USING_SCHEME.format("scheme", scheme);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LifecycleContext.values().length];
            iArr[LifecycleContext.REDIRECTING_TO_APP.ordinal()] = 1;
            iArr[LifecycleContext.REDIRECTING_USING_SCHEME.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LifecycleContext(String str) {
        this.contextTemplate = str;
    }

    @JvmStatic
    public static final String redirectingToApp(String str) {
        return INSTANCE.redirectingToApp(str);
    }

    @JvmStatic
    public static final String redirectingUsingScheme(String str) {
        return INSTANCE.redirectingUsingScheme(str);
    }

    public final String format(String value) {
        String replace$default;
        String replace$default2;
        if (value == null) {
            value = "null";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            replace$default = StringsKt__StringsJVMKt.replace$default(this.contextTemplate, "{package_name}", value, false, 4, (Object) null);
            return replace$default;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        replace$default2 = StringsKt__StringsJVMKt.replace$default(this.contextTemplate, "{scheme}", value, false, 4, (Object) null);
        return replace$default2;
    }

    /* renamed from: getTemplate, reason: from getter */
    public final String getContextTemplate() {
        return this.contextTemplate;
    }

    public final String format(String tokenName, String value) {
        String replace$default;
        Intrinsics.checkNotNullParameter(tokenName, "tokenName");
        if (value == null) {
            value = "null";
        }
        replace$default = StringsKt__StringsJVMKt.replace$default(this.contextTemplate, androidx.compose.runtime.t.c("{", '}', tokenName), value, false, 4, (Object) null);
        return replace$default;
    }
}
