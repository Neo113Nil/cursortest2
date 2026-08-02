package androidx.glance.state;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.K;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/glance/state/PreferencesGlanceStateDefinition;", "Landroidx/glance/state/GlanceStateDefinition;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileKey", "Ljava/io/File;", "getLocation", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "Landroidx/datastore/core/DataStore;", "getDataStore", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/K;", "scope", "", "setCoroutineScope", "(Lkotlinx/coroutines/K;)V", "coroutineScope", "Lkotlinx/coroutines/K;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreferencesGlanceStateDefinition implements GlanceStateDefinition<Preferences> {
    private static K coroutineScope;
    public static final PreferencesGlanceStateDefinition INSTANCE = new PreferencesGlanceStateDefinition();
    public static final int $stable = 8;

    private PreferencesGlanceStateDefinition() {
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public Object getDataStore(final Context context, final String str, Continuation<? super DataStore<Preferences>> continuation) {
        DataStore create$default;
        K k = coroutineScope;
        return (k == null || (create$default = PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, (ReplaceFileCorruptionHandler) null, (List) null, k, new Function0<File>() { // from class: androidx.glance.state.PreferencesGlanceStateDefinition$getDataStore$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return PreferenceDataStoreFile.preferencesDataStoreFile(context, str);
            }
        }, 3, (Object) null)) == null) ? PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, (ReplaceFileCorruptionHandler) null, (List) null, (K) null, new Function0<File>() { // from class: androidx.glance.state.PreferencesGlanceStateDefinition$getDataStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return PreferenceDataStoreFile.preferencesDataStoreFile(context, str);
            }
        }, 7, (Object) null) : create$default;
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public File getLocation(Context context, String fileKey) {
        return PreferenceDataStoreFile.preferencesDataStoreFile(context, fileKey);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCoroutineScope(K scope) {
        coroutineScope = scope;
    }
}
