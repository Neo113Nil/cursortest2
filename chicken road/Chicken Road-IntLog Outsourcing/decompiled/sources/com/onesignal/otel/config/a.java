package com.onesignal.otel.config;

import com.onesignal.otel.config.OtelConfigShared;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import x3.g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5351b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f5350a = i2;
        this.f5351b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f5350a) {
            case 0:
                return ((OtelConfigShared.LogLimitsConfig) this.f5351b).logLimits();
            default:
                g gVar = (g) this.f5351b;
                gVar.getClass();
                final HashMap hashMap = new HashMap();
                gVar.f12326f.getClass();
                Map emptyMap = Collections.emptyMap();
                if (emptyMap != null) {
                    final int i2 = 0;
                    emptyMap.forEach(new BiConsumer() { // from class: x3.e
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            switch (i2) {
                                case 0:
                                    hashMap.put(str, Collections.singletonList(str2));
                                    break;
                                default:
                                    hashMap.merge(str, Collections.singletonList(str2), new f());
                                    break;
                            }
                        }
                    });
                }
                final int i3 = 1;
                gVar.f12325e.forEach(new BiConsumer() { // from class: x3.e
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        switch (i3) {
                            case 0:
                                hashMap.put(str, Collections.singletonList(str2));
                                break;
                            default:
                                hashMap.merge(str, Collections.singletonList(str2), new f());
                                break;
                        }
                    }
                });
                return hashMap;
        }
    }
}
