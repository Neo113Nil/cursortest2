package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\u000b\u001a@\u0010\f\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Landroidx/fragment/app/Fragment;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/fragment/app/FragmentTransaction;", "", "containerViewId", "", "tag", "Landroid/os/Bundle;", "args", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/fragment/app/FragmentTransaction;ILjava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/FragmentTransaction;", "(Landroidx/fragment/app/FragmentTransaction;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/FragmentTransaction;", "replace"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.FragmentTransaction fragmentTransaction, int i, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        return fragmentTransaction.add(i, androidx.fragment.app.Fragment.class, bundle, str);
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction add$default(androidx.fragment.app.FragmentTransaction fragmentTransaction, int i, java.lang.String str, android.os.Bundle bundle, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        return fragmentTransaction.add(i, androidx.fragment.app.Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        return fragmentTransaction.add(androidx.fragment.app.Fragment.class, bundle, str);
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction add$default(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        return fragmentTransaction.add(androidx.fragment.app.Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction replace(androidx.fragment.app.FragmentTransaction fragmentTransaction, int i, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        return fragmentTransaction.replace(i, androidx.fragment.app.Fragment.class, bundle, str);
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction replace$default(androidx.fragment.app.FragmentTransaction fragmentTransaction, int i, java.lang.String str, android.os.Bundle bundle, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        return fragmentTransaction.replace(i, androidx.fragment.app.Fragment.class, bundle, str);
    }
}
