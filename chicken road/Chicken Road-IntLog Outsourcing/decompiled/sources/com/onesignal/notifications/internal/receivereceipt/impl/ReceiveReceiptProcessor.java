package com.onesignal.notifications.internal.receivereceipt.impl;

import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class ReceiveReceiptProcessor implements IReceiveReceiptProcessor {
    private final INotificationBackendService _backend;
    private final IDeviceService _deviceService;

    public ReceiveReceiptProcessor(IDeviceService _deviceService, INotificationBackendService _backend) {
        i.e(_deviceService, "_deviceService");
        i.e(_backend, "_backend");
        this._deviceService = _deviceService;
        this._backend = _backend;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        com.onesignal.debug.internal.logging.Logging.info$default("Receive receipt failed with statusCode: " + r8.getStatusCode() + " response: " + r8.getResponse(), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @Override // com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, InterfaceC1218d interfaceC1218d) {
        ReceiveReceiptProcessor$sendReceiveReceipt$1 receiveReceiptProcessor$sendReceiveReceipt$1;
        int i2;
        if (interfaceC1218d instanceof ReceiveReceiptProcessor$sendReceiveReceipt$1) {
            receiveReceiptProcessor$sendReceiveReceipt$1 = (ReceiveReceiptProcessor$sendReceiveReceipt$1) interfaceC1218d;
            int i3 = receiveReceiptProcessor$sendReceiveReceipt$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                receiveReceiptProcessor$sendReceiveReceipt$1.label = i3 - Integer.MIN_VALUE;
                ReceiveReceiptProcessor$sendReceiveReceipt$1 receiveReceiptProcessor$sendReceiveReceipt$12 = receiveReceiptProcessor$sendReceiveReceipt$1;
                Object obj = receiveReceiptProcessor$sendReceiveReceipt$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = receiveReceiptProcessor$sendReceiveReceipt$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    IDeviceService.DeviceType deviceType = this._deviceService.getDeviceType();
                    INotificationBackendService iNotificationBackendService = this._backend;
                    receiveReceiptProcessor$sendReceiveReceipt$12.label = 1;
                    if (iNotificationBackendService.updateNotificationAsReceived(str, str3, str2, deviceType, receiveReceiptProcessor$sendReceiveReceipt$12) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return v.f5689a;
            }
        }
        receiveReceiptProcessor$sendReceiveReceipt$1 = new ReceiveReceiptProcessor$sendReceiveReceipt$1(this, interfaceC1218d);
        ReceiveReceiptProcessor$sendReceiveReceipt$1 receiveReceiptProcessor$sendReceiveReceipt$122 = receiveReceiptProcessor$sendReceiveReceipt$1;
        Object obj2 = receiveReceiptProcessor$sendReceiveReceipt$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = receiveReceiptProcessor$sendReceiveReceipt$122.label;
        if (i2 != 0) {
        }
        return v.f5689a;
    }
}
