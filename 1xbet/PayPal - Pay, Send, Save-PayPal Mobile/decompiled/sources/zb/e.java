package zb;

/* loaded from: classes18.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7091a;
    public final java.lang.String b;
    public final common.emv.configuration.ApplicationConfiguration c;
    public final common.emv.kernel.Kernel d;
    public byte[] e;
    public int f;
    public boolean g;
    public java.lang.String h;

    public e(java.lang.String str, java.lang.String str2, common.emv.kernel.Kernel kernel, common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        byte[] bArr;
        this.f7091a = str;
        this.b = str2;
        this.d = kernel;
        this.c = applicationConfiguration;
        this.g = false;
        if (applicationConfiguration.getEntryConfigurationData(transactionType) != null) {
            bArr = applicationConfiguration.getEntryConfigurationData(transactionType).getTerminalTransactionQualifier() != null ? applicationConfiguration.getEntryConfigurationData(transactionType).getTerminalTransactionQualifier() : null;
            if (applicationConfiguration.getEntryConfigurationData(transactionType).isExtendedSelectionSupport() != null) {
                this.g = applicationConfiguration.getEntryConfigurationData(transactionType).isExtendedSelectionSupport().booleanValue();
            }
            if (applicationConfiguration.getEntryConfigurationData(transactionType).getListOfSupportedAidsForNonPPSE() != null) {
                this.h = applicationConfiguration.getEntryConfigurationData(transactionType).getListOfSupportedAidsForNonPPSE();
            }
        } else {
            bArr = null;
        }
        this.e = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
        this.f = 0;
    }
}
