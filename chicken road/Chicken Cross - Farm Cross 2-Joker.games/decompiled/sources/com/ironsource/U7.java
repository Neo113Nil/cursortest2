package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface U7<T> {
    T a(String str);

    void a(T t);

    void a(String str, T t);

    public static final class a implements U7<ISDemandOnlyInterstitialListener> {

        /* renamed from: a, reason: collision with root package name */
        private T7 f7948a = new T7();
        private final Map<String, T7> b = new HashMap();

        @Override // com.ironsource.U7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            T7 t7 = this.b.get(instanceId);
            return t7 != null ? t7 : this.f7948a;
        }

        @Override // com.ironsource.U7
        public void a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f7948a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                T7 t7 = this.b.get(it.next());
                if (t7 != null) {
                    t7.a(listener);
                }
            }
        }

        @Override // com.ironsource.U7
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                T7 t7 = this.b.get(instanceId);
                if (t7 != null) {
                    t7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new T7(listener));
        }
    }

    public static final class b implements U7<ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a, reason: collision with root package name */
        private W7 f7949a = new W7();
        private final Map<String, W7> b = new HashMap();

        @Override // com.ironsource.U7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            W7 w7 = this.b.get(instanceId);
            return w7 != null ? w7 : this.f7949a;
        }

        @Override // com.ironsource.U7
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f7949a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                W7 w7 = this.b.get(it.next());
                if (w7 != null) {
                    w7.a(listener);
                }
            }
        }

        @Override // com.ironsource.U7
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                W7 w7 = this.b.get(instanceId);
                if (w7 != null) {
                    w7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new W7(listener));
        }
    }
}
