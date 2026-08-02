package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "", "Landroid/view/View;", "parent", "", "childName", "", "resolveChildUniqueIdentifier", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/Long;", "view", "resolveViewId", "(Landroid/view/View;)J"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ViewIdentifierResolver {
    java.lang.Long resolveChildUniqueIdentifier(android.view.View parent, java.lang.String childName);

    long resolveViewId(android.view.View view);
}
