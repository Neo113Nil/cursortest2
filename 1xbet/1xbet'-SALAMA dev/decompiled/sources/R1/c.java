package R1;

import W5.A1;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5887b;

    public /* synthetic */ c(int i7) {
        this.f5886a = i7;
    }

    public void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0378  */
    /* JADX WARN: Code duplicated, block: B:146:0x0383 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d dVar;
        ArrayDeque arrayDeque;
        android.support.v4.media.session.o oVar;
        android.support.v4.media.session.m mVar;
        c cVar;
        int size;
        p028d6.k[] kVarArr;
        switch (this.f5886a) {
            case 0:
                e eVar = (e) this.f5887b;
                eVar.getClass();
                int i7 = message.what;
                d dVar2 = null;
                if (i7 != 0) {
                    if (i7 == 1) {
                        dVar = (d) message.obj;
                        int i8 = dVar.f5888a;
                        MediaCodec.CryptoInfo cryptoInfo = dVar.f5890c;
                        long j = dVar.f5891d;
                        int i9 = dVar.f5892e;
                        try {
                            synchronized (e.f5894h) {
                                eVar.f5895a.queueSecureInputBuffer(i8, 0, cryptoInfo, j, i9);
                                break;
                            }
                        } catch (RuntimeException e7) {
                            AtomicReference atomicReference = eVar.f5898d;
                            while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i7 != 2) {
                        AtomicReference atomicReference2 = eVar.f5898d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        eVar.f5899e.a();
                    }
                    if (dVar2 != null) {
                        arrayDeque = e.f5893g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(dVar2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                dVar = (d) message.obj;
                try {
                    eVar.f5895a.queueInputBuffer(dVar.f5888a, 0, dVar.f5889b, dVar.f5891d, dVar.f5892e);
                    break;
                } catch (RuntimeException e8) {
                    AtomicReference atomicReference3 = eVar.f5898d;
                    while (!atomicReference3.compareAndSet(null, e8) && atomicReference3.get() == null) {
                    }
                }
                dVar2 = dVar;
                if (dVar2 != null) {
                    arrayDeque = e.f5893g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(dVar2);
                        return;
                    }
                }
                return;
            case 1:
                if (message.what == 1) {
                    synchronized (((android.support.v4.media.session.m) this.f5887b).f8053a) {
                        oVar = (android.support.v4.media.session.o) ((android.support.v4.media.session.m) this.f5887b).f8056d.get();
                        mVar = (android.support.v4.media.session.m) this.f5887b;
                        cVar = mVar.f8057e;
                        break;
                    }
                    if (oVar == null || mVar != oVar.b() || cVar == null) {
                        return;
                    }
                    oVar.f((p117q0.t) message.obj);
                    ((android.support.v4.media.session.m) this.f5887b).a(oVar, cVar);
                    oVar.f(null);
                    return;
                }
                return;
            case 2:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f5887b).get(), message.what);
                    return;
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 3:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                p110p0.b bVar = (p110p0.b) this.f5887b;
                while (true) {
                    synchronized (bVar.f15675b) {
                        try {
                            size = bVar.f15677d.size();
                            if (size <= 0) {
                                return;
                            }
                            kVarArr = new p028d6.k[size];
                            bVar.f15677d.toArray(kVarArr);
                            bVar.f15677d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        p028d6.k kVar = kVarArr[i11];
                        int size2 = ((ArrayList) kVar.f12448c).size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            p110p0.a aVar = (p110p0.a) ((ArrayList) kVar.f12448c).get(i12);
                            if (!aVar.f15671d) {
                                aVar.f15669b.onReceive(bVar.f15674a, (Intent) kVar.f12447b);
                            }
                        }
                    }
                }
                break;
            default:
                p117q0.s sVar = (p117q0.s) this.f5887b;
                if (sVar == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                Bundle data = message.getData();
                int i13 = message.what;
                p033e3.h hVar = sVar.f15784b;
                switch (i13) {
                    case 1:
                        Bundle bundle = data.getBundle("data_root_hints");
                        android.support.v4.media.session.t.Z(bundle);
                        String string = data.getString("data_package_name");
                        int i14 = data.getInt("data_calling_pid");
                        int i15 = data.getInt("data_calling_uid");
                        p096n1.e eVar2 = new p096n1.e(message.replyTo, 19);
                        p117q0.s sVar2 = (p117q0.s) hVar.f12673a;
                        if (string != null) {
                            for (String str : sVar2.getPackageManager().getPackagesForUid(i15)) {
                                if (str.equals(string)) {
                                    sVar2.f15788f.a(new p117q0.o(i14, i15, bundle, hVar, string, eVar2));
                                    return;
                                }
                            }
                        } else {
                            sVar2.getClass();
                        }
                        throw new IllegalArgumentException("Package/uid mismatch: uid=" + i15 + " package=" + string);
                    case 2:
                        ((p117q0.s) hVar.f12673a).f15788f.a(new p117q0.p(hVar, new p096n1.e(message.replyTo, 19), 0));
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle("data_options");
                        android.support.v4.media.session.t.Z(bundle2);
                        ((p117q0.s) hVar.f12673a).f15788f.a(new A1(hVar, new p096n1.e(message.replyTo, 19), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, 4));
                        return;
                    case 4:
                        ((p117q0.s) hVar.f12673a).f15788f.a(new A2.c(hVar, new p096n1.e(message.replyTo, 19), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 19, false));
                        return;
                    case 5:
                        String string2 = data.getString("data_media_item_id");
                        ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                        p096n1.e eVar3 = new p096n1.e(message.replyTo, 19);
                        hVar.getClass();
                        if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                            return;
                        }
                        ((p117q0.s) hVar.f12673a).f15788f.a(new A2.c(hVar, eVar3, string2, resultReceiver, 20, false));
                        return;
                    case 6:
                        Bundle bundle3 = data.getBundle("data_root_hints");
                        android.support.v4.media.session.t.Z(bundle3);
                        p096n1.e eVar4 = new p096n1.e(message.replyTo, 19);
                        ((p117q0.s) hVar.f12673a).f15788f.a(new p117q0.q(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, hVar, data.getString("data_package_name"), eVar4));
                        return;
                    case 7:
                        ((p117q0.s) hVar.f12673a).f15788f.a(new p117q0.p(hVar, new p096n1.e(message.replyTo, 19), 1));
                        return;
                    case 8:
                        Bundle bundle4 = data.getBundle("data_search_extras");
                        android.support.v4.media.session.t.Z(bundle4);
                        String string3 = data.getString("data_search_query");
                        ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                        p096n1.e eVar5 = new p096n1.e(message.replyTo, 19);
                        hVar.getClass();
                        if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                            return;
                        }
                        ((p117q0.s) hVar.f12673a).f15788f.a(new p117q0.r(hVar, eVar5, string3, bundle4, resultReceiver2, 0));
                        return;
                    case 9:
                        Bundle bundle5 = data.getBundle("data_custom_action_extras");
                        android.support.v4.media.session.t.Z(bundle5);
                        String string4 = data.getString("data_custom_action");
                        ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                        p096n1.e eVar6 = new p096n1.e(message.replyTo, 19);
                        hVar.getClass();
                        if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                            return;
                        }
                        ((p117q0.s) hVar.f12673a).f15788f.a(new p117q0.r(hVar, eVar6, string4, bundle5, resultReceiver3, 1));
                        return;
                    default:
                        Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.f5886a) {
            case 4:
                Bundle data = message.getData();
                data.setClassLoader(android.support.v4.media.e.class.getClassLoader());
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Looper looper, int i7) {
        super(looper);
        this.f5886a = i7;
        this.f5887b = obj;
    }
}
