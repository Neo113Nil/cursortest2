package com.door.brass.knob;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.internal.LazyClassKeyMap;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public abstract class Hilt_MainActivity extends ComponentActivity implements GeneratedComponentManagerHolder {
    public volatile ActivityComponentManager ZvpnNpCMEWSR3;
    public final Object uY26rxeEAFnDq = new Object();
    public boolean BD2CRjLJ8EtOqGQ = false;

    public Hilt_MainActivity() {
        final MainActivity mainActivity = (MainActivity) this;
        OnContextAvailableListener onContextAvailableListener = new OnContextAvailableListener() { // from class: com.door.brass.knob.Hilt_MainActivity.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void yzPsTade5rL7D3(ComponentActivity componentActivity) {
                MainActivity mainActivity2 = MainActivity.this;
                if (mainActivity2.BD2CRjLJ8EtOqGQ) {
                    return;
                }
                mainActivity2.BD2CRjLJ8EtOqGQ = true;
                ((MainActivity_GeneratedInjector) mainActivity2.b41X89IqSbKt()).getClass();
            }
        };
        ContextAwareHelper contextAwareHelper = this.b41X89IqSbKt;
        contextAwareHelper.getClass();
        ComponentActivity componentActivity = contextAwareHelper.hRNgd2zGCE5kj;
        if (componentActivity != null) {
            onContextAvailableListener.yzPsTade5rL7D3(componentActivity);
        }
        contextAwareHelper.yzPsTade5rL7D3.add(onContextAvailableListener);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object b41X89IqSbKt() {
        return uypNJrpDByoB().b41X89IqSbKt();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory i7xAcZoXXiIt() {
        ViewModelProvider.Factory i7xAcZoXXiIt = super.i7xAcZoXXiIt();
        DefaultViewModelFactories.InternalFactoryFactory yzPsTade5rL7D3 = ((DefaultViewModelFactories.ActivityEntryPoint) EntryPoints.yzPsTade5rL7D3(this, DefaultViewModelFactories.ActivityEntryPoint.class)).yzPsTade5rL7D3();
        LazyClassKeyMap lazyClassKeyMap = yzPsTade5rL7D3.yzPsTade5rL7D3;
        i7xAcZoXXiIt.getClass();
        return new HiltViewModelFactory(lazyClassKeyMap, i7xAcZoXXiIt, yzPsTade5rL7D3.hRNgd2zGCE5kj);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        uypNJrpDByoB().hRNgd2zGCE5kj();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = uypNJrpDByoB().Uo5pffGf8LUU;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.yzPsTade5rL7D3 = null;
        }
    }

    public final ActivityComponentManager uypNJrpDByoB() {
        if (this.ZvpnNpCMEWSR3 == null) {
            synchronized (this.uY26rxeEAFnDq) {
                try {
                    if (this.ZvpnNpCMEWSR3 == null) {
                        this.ZvpnNpCMEWSR3 = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.ZvpnNpCMEWSR3;
    }
}
