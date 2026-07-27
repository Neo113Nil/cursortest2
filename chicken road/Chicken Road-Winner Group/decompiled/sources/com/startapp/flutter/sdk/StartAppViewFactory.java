package com.startapp.flutter.sdk;

import T1.r;
import android.content.Context;
import com.startapp.flutter.sdk.StartAppView;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.h;
import java.util.Map;

/* loaded from: classes.dex */
public class StartAppViewFactory<T extends StartAppView> extends h {
    private final FactoryMethod<T> factory;

    public interface FactoryMethod<T extends StartAppView> {
        T newInstance();
    }

    public StartAppViewFactory(FactoryMethod<T> factoryMethod) {
        super(r.INSTANCE);
        this.factory = factoryMethod;
    }

    @Override // io.flutter.plugin.platform.h
    public g create(Context context, int i3, Object obj) {
        T newInstance = this.factory.newInstance();
        newInstance.createView(context, i3, (Map) obj);
        return newInstance;
    }
}
