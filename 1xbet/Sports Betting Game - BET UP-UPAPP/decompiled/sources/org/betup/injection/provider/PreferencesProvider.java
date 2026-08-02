package org.betup.injection.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class PreferencesProvider {
    private final Context context;

    @Inject
    public PreferencesProvider(Context context) {
        this.context = context;
    }

    public SharedPreferences getSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(this.context);
    }
}
