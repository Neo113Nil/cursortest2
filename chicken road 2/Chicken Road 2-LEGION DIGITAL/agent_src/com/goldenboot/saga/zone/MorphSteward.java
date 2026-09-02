package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R$\u0010 \u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/goldenboot/saga/zone/MorphSteward;", "", "<init>", "()V", "", "Lcom/goldenboot/saga/zone/DimenCommand;", "editCommands", "failedCommand", "", "injectMetric", "(Ljava/util/List;Lcom/goldenboot/saga/zone/DimenCommand;)Ljava/lang/String;", "updateTimer", "(Lcom/goldenboot/saga/zone/DimenCommand;)Ljava/lang/String;", "Lcom/goldenboot/saga/zone/GridPatch;", "value", "Lcom/goldenboot/saga/zone/LayerCache;", "textInputSession", "Lcom/goldenboot/saga/zone/DpadBuilder;", "flushSample", "(Lcom/goldenboot/saga/zone/GridPatch;Lcom/goldenboot/saga/zone/LayerCache;)V", "growPayload", "(Ljava/util/List;)Lcom/goldenboot/saga/zone/GridPatch;", "applyTask", "()Lcom/goldenboot/saga/zone/GridPatch;", "evictLayout", "Lcom/goldenboot/saga/zone/GridPatch;", "clipOrigin", "mBufferState", "Lcom/goldenboot/saga/zone/PatternFacilitator;", "Lcom/goldenboot/saga/zone/PatternFacilitator;", "releaseHeader", "()Lcom/goldenboot/saga/zone/PatternFacilitator;", "mBuffer", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MorphSteward {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private TextFieldValue mBufferState = new TextFieldValue(IconLink.purgeNode(), StylusEvent.INSTANCE.evictLayout(), (StylusEvent) null, (DefaultConstructorMarker) null);

    /* renamed from: growPayload, reason: from kotlin metadata */
    private PatternFacilitator mBuffer = new PatternFacilitator(this.mBufferState.getText(), this.mBufferState.getSelection(), (DefaultConstructorMarker) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence detachStream(DimenCommand dimenCommand, MorphSteward morphSteward, DimenCommand dimenCommand2) {
        return (dimenCommand == dimenCommand2 ? " > " : "   ") + morphSteward.updateTimer(dimenCommand2);
    }

    private final String injectMetric(List<? extends DimenCommand> editCommands, final DimenCommand failedCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.applyTask() + ", composition=" + this.mBuffer.releaseHeader() + ", selection=" + ((Object) StylusEvent.connectPatch(this.mBuffer.popBlueprint())) + "):");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        CursorCollector.serializeTask(editCommands, sb, (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new TouchRecord() { // from class: com.goldenboot.saga.zone.SystemAnalyzer
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                CharSequence detachStream;
                detachStream = MorphSteward.detachStream(DimenCommand.this, this, (DimenCommand) obj);
                return detachStream;
            }
        });
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final String updateTimer(DimenCommand dimenCommand) {
        if (dimenCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) dimenCommand;
            sb.append(commitTextCommand.detachStream().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (dimenCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) dimenCommand;
            sb2.append(setComposingTextCommand.detachStream().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (dimenCommand instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) dimenCommand).toString();
        }
        if (dimenCommand instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) dimenCommand).toString();
        }
        if (dimenCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) dimenCommand).toString();
        }
        if (dimenCommand instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) dimenCommand).toString();
        }
        if (dimenCommand instanceof SavePartition) {
            return ((SavePartition) dimenCommand).toString();
        }
        if (dimenCommand instanceof SectionLoader) {
            return ((SectionLoader) dimenCommand).toString();
        }
        if (dimenCommand instanceof MoveCursorCommand) {
            return ((MoveCursorCommand) dimenCommand).toString();
        }
        if (dimenCommand instanceof BannerImporter) {
            return ((BannerImporter) dimenCommand).toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String simpleName = Reflection.getOrCreateKotlinClass(dimenCommand.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "{anonymous EditCommand}";
        }
        sb3.append(simpleName);
        return sb3.toString();
    }

    /* renamed from: applyTask, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final TextFieldValue clipOrigin() {
        return this.mBufferState;
    }

    public final void flushSample(TextFieldValue value, LayerCache textInputSession) {
        boolean areEqual = Intrinsics.areEqual(value.getComposition(), this.mBuffer.releaseHeader());
        boolean z = true;
        boolean z2 = false;
        if (!Intrinsics.areEqual(this.mBufferState.getText().getText(), value.getText().getText())) {
            this.mBuffer = new PatternFacilitator(value.getText(), value.getSelection(), (DefaultConstructorMarker) null);
        } else if (StylusEvent.flushSample(this.mBufferState.getSelection(), value.getSelection())) {
            z = false;
        } else {
            this.mBuffer.attachConfig(StylusEvent.connectJob(value.getSelection()), StylusEvent.drawField(value.getSelection()));
            z2 = true;
            z = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.growPayload();
        } else if (!StylusEvent.updateTimer(value.getComposition().getPackedValue())) {
            this.mBuffer.notifyMessage(StylusEvent.connectJob(value.getComposition().getPackedValue()), StylusEvent.drawField(value.getComposition().getPackedValue()));
        }
        if (z || (!z2 && !areEqual)) {
            this.mBuffer.growPayload();
            value = TextFieldValue.updateTimer(value, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.flushSample(textFieldValue, value);
        }
    }

    public final TextFieldValue growPayload(List<? extends DimenCommand> editCommands) {
        DimenCommand dimenCommand;
        DimenCommand dimenCommand2 = null;
        try {
            int size = editCommands.size();
            int i = 0;
            DimenCommand dimenCommand3 = null;
            while (i < size) {
                try {
                    dimenCommand = editCommands.get(i);
                } catch (Exception e) {
                    e = e;
                    dimenCommand2 = dimenCommand3;
                }
                try {
                    dimenCommand.evictLayout(this.mBuffer);
                    i++;
                    dimenCommand3 = dimenCommand;
                } catch (Exception e2) {
                    e = e2;
                    dimenCommand2 = dimenCommand;
                    throw new RuntimeException(injectMetric(editCommands, dimenCommand2), e);
                }
            }
            WatcherDelta purgeNode = this.mBuffer.purgeNode();
            long popBlueprint = this.mBuffer.popBlueprint();
            StylusEvent growPayload = StylusEvent.growPayload(popBlueprint);
            growPayload.getPackedValue();
            StylusEvent stylusEvent = StylusEvent.peekRevision(this.mBufferState.getSelection()) ? null : growPayload;
            TextFieldValue textFieldValue = new TextFieldValue(purgeNode, stylusEvent != null ? stylusEvent.getPackedValue() : ContextDelta.growPayload(StylusEvent.drawField(popBlueprint), StylusEvent.connectJob(popBlueprint)), this.mBuffer.releaseHeader(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final PatternFacilitator getMBuffer() {
        return this.mBuffer;
    }
}
