package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class CallableC4544n3 implements Callable<C4615r3> {

    /* renamed from: a, reason: collision with root package name */
    private final int f8447a;
    private final String b;
    private final AdData c;
    private final InterfaceC4580p3 d;
    private final InterfaceC4562o3 e;
    private final NetworkSettings f;

    /* renamed from: com.ironsource.n3$a */
    class a implements BiddingDataCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4385e5 f8448a;
        final /* synthetic */ BlockingQueue b;

        a(C4385e5 c4385e5, BlockingQueue blockingQueue) {
            this.f8448a = c4385e5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new C4615r3(CallableC4544n3.this.d(), CallableC4544n3.this.c(), null, C4385e5.a(this.f8448a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new C4615r3(CallableC4544n3.this.d(), CallableC4544n3.this.c(), map, C4385e5.a(this.f8448a), null));
        }
    }

    public CallableC4544n3(int i, String str, AdData adData, InterfaceC4580p3 interfaceC4580p3, InterfaceC4562o3 interfaceC4562o3, NetworkSettings networkSettings) {
        this.f8447a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC4580p3;
        this.e = interfaceC4562o3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4615r3 call() throws Exception {
        C4385e5 c4385e5 = new C4385e5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c4385e5, arrayBlockingQueue));
        } catch (Exception e) {
            C4491k4.d().a(e);
            String str = "Exception while calling collectBiddingData - " + e.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC4562o3 interfaceC4562o3 = this.e;
            if (interfaceC4562o3 != null) {
                interfaceC4562o3.a(str);
            }
        } catch (NoClassDefFoundError e2) {
            C4491k4.d().a(e2);
            String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC4562o3 interfaceC4562o32 = this.e;
            if (interfaceC4562o32 != null) {
                interfaceC4562o32.a(str2);
            }
        }
        InterfaceC4562o3 interfaceC4562o33 = this.e;
        if (interfaceC4562o33 != null) {
            interfaceC4562o33.a(this.f);
        }
        return (C4615r3) arrayBlockingQueue.take();
    }

    public InterfaceC4580p3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f8447a;
    }
}
