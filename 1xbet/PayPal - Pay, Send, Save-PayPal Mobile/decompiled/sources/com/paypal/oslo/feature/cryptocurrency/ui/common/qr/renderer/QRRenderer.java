package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/QRRenderer;", "", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "instructions", "", "execute", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;", "instruction", "drawBackground", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;", "drawDataModule", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;", "drawPositionMarker", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface QRRenderer {
    void drawBackground(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background instruction);

    void drawDataModule(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule instruction);

    void drawPositionMarker(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker instruction);

    void execute(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction> instructions);
}
