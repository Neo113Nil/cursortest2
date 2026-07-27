package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.PIIHasher;
import com.onesignal.user.internal.Subscription;
import com.onesignal.user.subscriptions.IEmailSubscription;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.ISmsSubscription;
import com.onesignal.user.subscriptions.ISubscription;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SubscriptionList {
    private final IPushSubscription _fallbackPushSub;
    private final List<ISubscription> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionList(List<? extends ISubscription> collection, IPushSubscription _fallbackPushSub) {
        i.e(collection, "collection");
        i.e(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    public final IEmailSubscription getByEmail(String email) {
        Object obj;
        i.e(email, "email");
        String hash = PIIHasher.INSTANCE.hash(email);
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ISubscription iSubscription = (IEmailSubscription) obj;
            i.c(iSubscription, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((Subscription) iSubscription).getModel().getAddress();
            if (i.a(address, email) || i.a(address, hash)) {
                break;
            }
        }
        return (IEmailSubscription) obj;
    }

    public final ISmsSubscription getBySMS(String sms) {
        Object obj;
        i.e(sms, "sms");
        String hash = PIIHasher.INSTANCE.hash(sms);
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ISubscription iSubscription = (ISmsSubscription) obj;
            i.c(iSubscription, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((Subscription) iSubscription).getModel().getAddress();
            if (i.a(address, sms) || i.a(address, hash)) {
                break;
            }
        }
        return (ISmsSubscription) obj;
    }

    public final List<ISubscription> getCollection() {
        return this.collection;
    }

    public final List<IEmailSubscription> getEmails() {
        List<ISubscription> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IEmailSubscription) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final IPushSubscription getPush() {
        List<ISubscription> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IPushSubscription) {
                arrayList.add(obj);
            }
        }
        IPushSubscription iPushSubscription = (IPushSubscription) AbstractC0465j.G0(arrayList);
        return iPushSubscription == null ? this._fallbackPushSub : iPushSubscription;
    }

    public final List<ISmsSubscription> getSmss() {
        List<ISubscription> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ISmsSubscription) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
