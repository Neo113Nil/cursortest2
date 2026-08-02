package common.emv.kernel;

/* loaded from: classes17.dex */
public class TransactionRequest {

    /* renamed from: a, reason: collision with root package name */
    public final common.emv.kernel.TransactionData f6715a;
    public final long b = java.lang.System.currentTimeMillis();
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(0);
    public long d = 0;
    public long e = 0;
    public byte[] f = null;
    public byte[] g = null;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public byte[] l = null;
    public byte[] m = null;
    public boolean n = false;

    /* renamed from: o, reason: collision with root package name */
    public common.emv.kernel.TransactionOutcome.UserInterfaceRequestData f6716o;

    public void setZeroAmount(boolean z) {
        this.i = z;
    }

    public void setTtq(byte[] bArr) {
        this.l = bArr;
    }

    public void setStatusCheckRequested(boolean z) {
        this.h = z;
    }

    public void setRetainUserInterfaceData(common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData) {
        this.f6716o = userInterfaceRequestData;
    }

    public void setRestart(boolean z) {
        this.n = z;
    }

    public void setReaderCvmRequiredLimitExceed(boolean z) {
        this.j = z;
    }

    public void setReaderContactlessFloorLimitExceed(boolean z) {
        this.k = z;
    }

    public void setKernelIdentifierTerminal(byte[] bArr) {
        this.m = bArr;
    }

    public void setFci(byte[] bArr) {
        this.g = bArr;
    }

    public void setAid(byte[] bArr) {
        this.f = bArr;
    }

    public void markCompleteTimestamp() {
        this.e = java.lang.System.currentTimeMillis();
    }

    public void markCardDetectedTimestamp() {
        this.d = java.lang.System.currentTimeMillis();
    }

    public boolean isZeroAmount() {
        return this.i;
    }

    public boolean isStatusCheckRequested() {
        return this.h;
    }

    public boolean isRestart() {
        return this.n;
    }

    public boolean isReaderCvmRequiredLimitExceed() {
        return this.j;
    }

    public boolean isReaderContactlessFloorLimitExceed() {
        return this.k;
    }

    public byte[] getTtq() {
        return this.l;
    }

    public common.emv.kernel.TransactionData getTransactionData() {
        return this.f6715a;
    }

    public common.emv.kernel.TransactionOutcome.UserInterfaceRequestData getRetainUserInterfaceData() {
        return this.f6716o;
    }

    public byte[] getKernelIdentifierTerminal() {
        return this.m;
    }

    public java.util.concurrent.atomic.AtomicLong getIoSpent() {
        return this.c;
    }

    public byte[] getFci() {
        return this.g;
    }

    public long getCreatedTimestamp() {
        return this.b;
    }

    public long getCompleteTimestamp() {
        return this.e;
    }

    public long getCardDetectedTimestamp() {
        return this.d;
    }

    public byte[] getAid() {
        return this.f;
    }

    public TransactionRequest(common.emv.kernel.TransactionData transactionData) {
        this.f6715a = transactionData;
        markCardDetectedTimestamp();
    }
}
