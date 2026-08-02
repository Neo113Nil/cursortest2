package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/ContentResolverForSecureTextField;", "", "Landroid/net/Uri;", "uri", "", "notifyForDescendants", "Landroid/database/ContentObserver;", "observer", "", "registerContentObserver", "(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V", "unregisterContentObserver", "(Landroid/database/ContentObserver;)V", "getShowPassword", "()Z", "showPassword"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ContentResolverForSecureTextField {
    boolean getShowPassword();

    void registerContentObserver(android.net.Uri uri, boolean notifyForDescendants, android.database.ContentObserver observer);

    void unregisterContentObserver(android.database.ContentObserver observer);
}
