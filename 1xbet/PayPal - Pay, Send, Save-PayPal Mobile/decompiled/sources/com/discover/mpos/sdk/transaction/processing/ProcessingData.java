package com.discover.mpos.sdk.transaction.processing;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0092\u0002\u0093\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010é\u0001\u001a\u00030ê\u00012\b\u0010ë\u0001\u001a\u00030ì\u0001H\u0096\u0001J\u0011\u0010í\u0001\u001a\u00030ê\u00012\u0007\u0010î\u0001\u001a\u00020\u0019J\n\u0010ï\u0001\u001a\u00030ê\u0001H\u0016J\u000b\u0010ð\u0001\u001a\u00030ê\u0001H\u0096\u0001J\n\u0010ñ\u0001\u001a\u00020\u0004HÂ\u0003J\n\u0010ò\u0001\u001a\u00020\u0006HÂ\u0003J\n\u0010ó\u0001\u001a\u00020\u0011HÂ\u0003J\n\u0010ô\u0001\u001a\u00020\u0002HÂ\u0003J\n\u0010õ\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0016HÆ\u0003JF\u0010÷\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010ø\u0001\u001a\u00030À\u00012\u0007\u0010¿\u0001\u001a\u00020\u0019H\u0002J\t\u0010ù\u0001\u001a\u00020pH\u0002J\u0016\u0010ú\u0001\u001a\u00020\u00142\n\u0010û\u0001\u001a\u0005\u0018\u00010ü\u0001HÖ\u0003J\u0014\u0010ý\u0001\u001a\u0004\u0018\u00010<2\u0007\u0010þ\u0001\u001a\u00020pH\u0002J\u0011\u0010ÿ\u0001\u001a\t\u0012\u0005\u0012\u00030ì\u00010uH\u0096\u0001J\u0012\u0010\u0080\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010þ\u0001\u001a\u00020pJ\u0012\u0010\u0081\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010þ\u0001\u001a\u00020pJ\u0012\u0010\u0082\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010þ\u0001\u001a\u00020pJ\u0012\u0010\u0083\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010þ\u0001\u001a\u00020pJ\u001e\u0010\u0084\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010þ\u0001\u001a\u00020p2\b\u0010\u001e\u001a\u0004\u0018\u00010pH\u0002J\n\u0010\u0085\u0002\u001a\u00020QHÖ\u0001J\b\u0010\u0086\u0002\u001a\u00030ê\u0001J\u0007\u0010\u0087\u0002\u001a\u00020\u0014J/\u0010\u0088\u0002\u001a\u000e\u0012\u0005\u0012\u0003H\u0089\u00020\u0098\u0001R\u00020\u0000\"\u0005\b\u0000\u0010\u0089\u00022\u0011\u0010\u008a\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u0001H\u0089\u00020\u008b\u0002H\u0002J-\u0010\u008c\u0002\u001a\u000e\u0012\u0005\u0012\u0003H\u0089\u00020\u008d\u0002R\u00020\u0000\"\u0005\b\u0000\u0010\u0089\u00022\u000f\u0010\u008a\u0002\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00020\u008b\u0002H\u0002J\b\u0010\u008e\u0002\u001a\u00030ê\u0001J\b\u0010º\u0001\u001a\u00030ê\u0001J\n\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u0090\u0002J\t\u0010\u0091\u0002\u001a\u00020pH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001d\u0010-\u001a\u0004\u0018\u00010.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R/\u00105\u001a\u0004\u0018\u0001042\b\u00103\u001a\u0004\u0018\u0001048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bB\u0010CR\u001b\u0010F\u001a\u00020G8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bH\u0010IR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010K\u001a\u00020L8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bM\u0010NR\u000e\u0010P\u001a\u00020QX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020QX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010Z\u001a\u00020Y2\u0006\u00103\u001a\u00020Y@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001b\u0010d\u001a\u00020e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bh\u0010E\u001a\u0004\bf\u0010gR\u001d\u0010i\u001a\u0004\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bk\u00102\u001a\u0004\bj\u0010\u001bR\u001d\u0010l\u001a\u0004\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u00102\u001a\u0004\bm\u0010\u001bR\u001b\u0010o\u001a\u00020p8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bs\u0010E\u001a\u0004\bq\u0010rR!\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00190u8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010E\u001a\u0004\bv\u0010&R\u001d\u0010x\u001a\u0004\u0018\u00010.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bz\u00102\u001a\u0004\by\u00100R\u001a\u0010{\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010_\"\u0004\b}\u0010aR\u001e\u0010~\u001a\u00020\u007f8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010E\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R4\u0010\u0083\u0001\u001a\u0004\u0018\u00010<2\b\u00103\u001a\u0004\u0018\u00010<8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0087\u0001\u00102\u001a\u0005\b\u0084\u0001\u0010>\"\u0006\b\u0085\u0001\u0010\u0086\u0001R/\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\t\u0010\u001e\u001a\u0005\u0018\u00010\u0088\u0001@FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010_R\u0013\u0010\u008e\u0001\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010_R\u001d\u0010\u008f\u0001\u001a\u00020\u0014X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010_\"\u0005\b\u0090\u0001\u0010aR\u0015\u0010\u0091\u0001\u001a\u00030\u0092\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0013\u0010\u0095\u0001\u001a\u00020p8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010rR\u001e\u0010\u0097\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0098\u0001R\u00020\u00000#X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u00102\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001e\u0010¤\u0001\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010E\u001a\u0005\b¥\u0001\u0010\u001bR \u0010§\u0001\u001a\u00030¨\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010E\u001a\u0006\b©\u0001\u0010ª\u0001R\"\u0010¬\u0001\u001a\u0005\u0018\u00010\u00ad\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R \u0010²\u0001\u001a\u00030³\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¶\u0001\u0010E\u001a\u0006\b´\u0001\u0010µ\u0001R$\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020<0u8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b¹\u0001\u0010E\u001a\u0005\b¸\u0001\u0010&R\u001d\u0010º\u0001\u001a\u00020\u0014X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010_\"\u0005\b¼\u0001\u0010aR\u0010\u0010½\u0001\u001a\u00030¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010¿\u0001\u001a\u0005\u0018\u00010À\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R \u0010Å\u0001\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u00102\u001a\u0005\bÆ\u0001\u0010>R\u0015\u0010È\u0001\u001a\u00030É\u00018F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001d\u0010Ì\u0001\u001a\u00020\u0014X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010_\"\u0005\bÎ\u0001\u0010aR \u0010Ï\u0001\u001a\u00030Ð\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÓ\u0001\u0010E\u001a\u0006\bÑ\u0001\u0010Ò\u0001R \u0010Ô\u0001\u001a\u00030Õ\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bØ\u0001\u0010E\u001a\u0006\bÖ\u0001\u0010×\u0001R \u0010Ù\u0001\u001a\u00030Ú\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÝ\u0001\u0010E\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010Þ\u0001\u001a\u00030ß\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bâ\u0001\u0010E\u001a\u0006\bà\u0001\u0010á\u0001R\u001d\u0010ã\u0001\u001a\u00020\u0019X\u0086.¢\u0006\u0010\n\u0000\u001a\u0005\bä\u0001\u0010\u001b\"\u0005\bå\u0001\u0010\u001dR\u001d\u0010æ\u0001\u001a\u00020\u0014X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u0010_\"\u0005\bè\u0001\u0010a¨\u0006\u0094\u0002"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContentStorage;", "config", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "transactionData", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "transactionExtras", "Lcom/discover/mpos/sdk/data/external/TransactionExtras;", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;Lcom/discover/mpos/sdk/transaction/TransactionData;Lcom/discover/mpos/sdk/data/external/TransactionExtras;)V", "writeDataStorageUpdate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;)V", "startDWriteDataStorageUpdate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/StartDWriteDataStorageUpdate;", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;Lcom/discover/mpos/sdk/cardreader/entrypoint/model/StartDWriteDataStorageUpdate;)V", "algorithm", "Lcom/discover/mpos/sdk/security/CryptAlgorithm;", "containerContentStorage", "isSecondRePresentment", "", "dataStorageTemplate", "Lcom/discover/mpos/sdk/data/WriteDataStorageTemplate;", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;Lcom/discover/mpos/sdk/transaction/TransactionData;Lcom/discover/mpos/sdk/security/CryptAlgorithm;Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContentStorage;ZLcom/discover/mpos/sdk/data/WriteDataStorageTemplate;)V", "appCrypto", "", "getAppCrypto", "()[B", "setAppCrypto", "([B)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "applicationCryptogram", "getApplicationCryptogram", "setApplicationCryptogram", "applicationFileLocators", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ApplicationFileLocator;", "getApplicationFileLocators", "()Ljava/util/List;", "candidateList", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;", "getCandidateList", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;", "setCandidateList", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;)V", "cardEffectiveDate", "Lcom/discover/mpos/sdk/data/CardDate;", "getCardEffectiveDate", "()Lcom/discover/mpos/sdk/data/CardDate;", "cardEffectiveDate$delegate", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyOptionalProperty;", "<set-?>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "cardFeatureDescriptor", "getCardFeatureDescriptor", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "setCardFeatureDescriptor", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;)V", "cardFeatureDescriptor$delegate", "cardFeatureVersionNumber", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureVersionNumber", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "cardFeatureVersionNumber$delegate", "cardProcessingRequirements", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", "getCardProcessingRequirements", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", "cardProcessingRequirements$delegate", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyProperty;", "cardVerificationResults", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/ContactlessCardVerificationResults;", "getCardVerificationResults", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/ContactlessCardVerificationResults;", "cardVerificationResults$delegate", "cryptogramInformationData", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/model/CryptogramInformationData;", "getCryptogramInformationData", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/model/CryptogramInformationData;", "cryptogramInformationData$delegate", "cvrContentEndIndex", "", "cvrContentStartIndex", "dataStorage", "Lcom/discover/mpos/sdk/data/readdatarecord/DataStorage;", "getDataStorage", "()Lcom/discover/mpos/sdk/data/readdatarecord/DataStorage;", "setDataStorage", "(Lcom/discover/mpos/sdk/data/readdatarecord/DataStorage;)V", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;", "dataStorageDirectory", "getDataStorageDirectory", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;", "dataStorageEnabled", "getDataStorageEnabled", "()Z", "setDataStorageEnabled", "(Z)V", "getDataStorageTemplate", "()Lcom/discover/mpos/sdk/data/WriteDataStorageTemplate;", "dataStorageWriteResult", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/DataStorageWriteResult;", "getDataStorageWriteResult", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/DataStorageWriteResult;", "dataStorageWriteResult$delegate", "dedicatedFileName", "getDedicatedFileName", "dedicatedFileName$delegate", "discretionaryData", "getDiscretionaryData", "discretionaryData$delegate", "emvApplicationIdentifier", "", "getEmvApplicationIdentifier", "()Ljava/lang/String;", "emvApplicationIdentifier$delegate", "exceptionPanList", "", "getExceptionPanList", "exceptionPanList$delegate", "expirationDate", "getExpirationDate", "expirationDate$delegate", "extendedLoggingEnabled", "getExtendedLoggingEnabled", "setExtendedLoggingEnabled", "ffIdentifier", "Lcom/discover/mpos/sdk/cardreader/config/FormFactorIdentifier;", "getFfIdentifier", "()Lcom/discover/mpos/sdk/cardreader/config/FormFactorIdentifier;", "ffIdentifier$delegate", "formFactorIdentifier", "getFormFactorIdentifier", "setFormFactorIdentifier", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "formFactorIdentifier$delegate", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "getProcessingOptionsResponse", "getGetProcessingOptionsResponse", "()Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "setGetProcessingOptionsResponse", "(Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;)V", "isTearingRecoverySupported", "isTransactionResumed", "setTransactionResumed", "issuerScriptCommands", "Lcom/discover/mpos/sdk/data/external/IssuerScriptCommands;", "getIssuerScriptCommands", "()Lcom/discover/mpos/sdk/data/external/IssuerScriptCommands;", "kernelId", "getKernelId", "lazyProperties", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyOptionalProperty;", "offlineBalance", "Lcom/discover/mpos/sdk/core/data/Amount;", "getOfflineBalance", "()Lcom/discover/mpos/sdk/core/data/Amount;", "offlineBalance$delegate", "outcomeParameters", "Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "getOutcomeParameters", "()Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "setOutcomeParameters", "(Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;)V", "pdolContent", "getPdolContent", "pdolContent$delegate", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "pdolData$delegate", "preProcessingData", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "getPreProcessingData", "()Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "setPreProcessingData", "(Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;)V", "preProcessingIndicators", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "getPreProcessingIndicators", "()Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "preProcessingIndicators$delegate", "readRecordData", "getReadRecordData", "readRecordData$delegate", "restart", "getRestart", "setRestart", "safeIndexBasedExtractor", "Lcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;", "selectApplicationResponse", "Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;", "getSelectApplicationResponse", "()Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;", "setSelectApplicationResponse", "(Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;)V", "staticDataToBeAuthenticated", "getStaticDataToBeAuthenticated", "staticDataToBeAuthenticated$delegate", "supportedContainerIds", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds;", "getSupportedContainerIds", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds;", "tearingRecoveryEnabled", "getTearingRecoveryEnabled", "setTearingRecoveryEnabled", "terminalTransactionQualifiers", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "getTerminalTransactionQualifiers", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "terminalTransactionQualifiers$delegate", "terminalVerificationResults", "Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "getTerminalVerificationResults", "()Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "terminalVerificationResults$delegate", "track2EquivalentData", "Lcom/discover/mpos/sdk/data/Track2EquivalentData;", "getTrack2EquivalentData", "()Lcom/discover/mpos/sdk/data/Track2EquivalentData;", "track2EquivalentData$delegate", "transactionStatusInformation", "Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "getTransactionStatusInformation", "()Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "transactionStatusInformation$delegate", "unpredictableNumber", "getUnpredictableNumber", "setUnpredictableNumber", "usageControlChecksSkipped", "getUsageControlChecksSkipped", "setUsageControlChecksSkipped", "addContainerContent", "", "containerContent", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContent;", "buildDataStorageDirectory", "dataStorageContent", "clear", "clearContainerContent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "createSelectApplicationResponse", "debugTag", "equals", "other", "", "getConfigTlv", "tag", "getContainersContent", "getTlv", "getTlvFromGPO", "getTlvFromGpoOrReadRecord", "getTlvFromReadRecord", "getTlvOrNull", "hashCode", "invalidateCardFeatureDescriptor", "isDataStorageSupportedByCard", "lazyOptionalProperty", "T", "initializer", "Lkotlin/Function0;", "lazyProperty", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyProperty;", "reset", "selectedCandidate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;", "toString", "LazyOptionalProperty", "LazyProperty", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class ProcessingData implements com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage, com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.KProperty[] f3244a = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "readRecordData", "getReadRecordData()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "pdolData", "getPdolData()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "pdolContent", "getPdolContent()[B", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "track2EquivalentData", "getTrack2EquivalentData()Lcom/discover/mpos/sdk/data/Track2EquivalentData;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "terminalVerificationResults", "getTerminalVerificationResults()Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "transactionStatusInformation", "getTransactionStatusInformation()Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "cardProcessingRequirements", "getCardProcessingRequirements()Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "cryptogramInformationData", "getCryptogramInformationData()Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/model/CryptogramInformationData;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "cardVerificationResults", "getCardVerificationResults()Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/ContactlessCardVerificationResults;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "emvApplicationIdentifier", "getEmvApplicationIdentifier()Ljava/lang/String;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "terminalTransactionQualifiers", "getTerminalTransactionQualifiers()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "ffIdentifier", "getFfIdentifier()Lcom/discover/mpos/sdk/cardreader/config/FormFactorIdentifier;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "preProcessingIndicators", "getPreProcessingIndicators()Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "exceptionPanList", "getExceptionPanList()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "offlineBalance", "getOfflineBalance()Lcom/discover/mpos/sdk/core/data/Amount;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "dedicatedFileName", "getDedicatedFileName()[B", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "staticDataToBeAuthenticated", "getStaticDataToBeAuthenticated()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "cardEffectiveDate", "getCardEffectiveDate()Lcom/discover/mpos/sdk/data/CardDate;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "expirationDate", "getExpirationDate()Lcom/discover/mpos/sdk/data/CardDate;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "discretionaryData", "getDiscretionaryData()[B", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "cardFeatureDescriptor", "getCardFeatureDescriptor()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "formFactorIdentifier", "getFormFactorIdentifier()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "cardFeatureVersionNumber", "getCardFeatureVersionNumber()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.transaction.processing.ProcessingData.class, "dataStorageWriteResult", "getDataStorageWriteResult()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/DataStorageWriteResult;", 0))};
    public boolean A;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.a B;
    public boolean C;
    final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration D;
    final com.discover.mpos.sdk.transaction.TransactionData E;
    public final com.discover.mpos.sdk.security.CryptAlgorithm F;
    public final boolean G;
    public final com.discover.mpos.sdk.data.WriteDataStorageTemplate H;
    private final java.util.List<com.discover.mpos.sdk.transaction.processing.ProcessingData.a<?>> I;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b J;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b K;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b L;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b M;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b N;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b O;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b P;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b Q;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b R;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b S;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b T;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b U;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.a V;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.a W;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.a X;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData.b Y;
    private final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage Z;
    public final com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor b;
    public com.discover.mpos.sdk.data.readdatarecord.DataStorage c;
    public boolean d;
    public byte[] e;
    public com.discover.mpos.sdk.transaction.outcome.OutcomeParameters f;
    public com.discover.mpos.sdk.transaction.processing.PreProcessingData g;
    public com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList h;
    public boolean i;
    public com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent j;
    public com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse k;
    public final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator> l;
    public final com.discover.mpos.sdk.data.external.IssuerScriptCommands m;
    public com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory n;

    /* renamed from: o, reason: collision with root package name */
    final int f3245o;
    final int p;
    public byte[] q;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.b r;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.b s;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.a t;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.a u;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.a v;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.a w;
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData.a x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    private ProcessingData(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.security.CryptAlgorithm cryptAlgorithm, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage containerContentStorage, boolean z2, com.discover.mpos.sdk.data.WriteDataStorageTemplate writeDataStorageTemplate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptAlgorithm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerContentStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeDataStorageTemplate, "");
        this.D = readerConfiguration;
        this.E = transactionData;
        this.F = cryptAlgorithm;
        this.Z = containerContentStorage;
        this.G = z2;
        this.H = writeDataStorageTemplate;
        this.b = new com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor();
        this.I = new java.util.ArrayList();
        this.h = new com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList();
        this.l = new java.util.ArrayList();
        this.m = new com.discover.mpos.sdk.data.external.IssuerScriptCommands(null, 1, 0 == true ? 1 : 0);
        this.f3245o = 2;
        this.p = 10;
        this.J = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.u());
        this.K = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.s());
        this.L = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.r());
        this.M = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.y());
        this.N = b(com.discover.mpos.sdk.transaction.processing.ProcessingData.x.f3268a);
        this.O = b(com.discover.mpos.sdk.transaction.processing.ProcessingData.z.f3270a);
        this.P = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.f());
        this.Q = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.h());
        this.r = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.g());
        this.s = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.l());
        this.R = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.w());
        this.S = b(com.discover.mpos.sdk.transaction.processing.ProcessingData.o.f3259a);
        this.T = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.t());
        this.U = b(new com.discover.mpos.sdk.transaction.processing.ProcessingData.m());
        this.t = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.q());
        this.u = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.j());
        this.v = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.v());
        this.w = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.c());
        this.x = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.n());
        this.V = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.k());
        this.B = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.d());
        this.W = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.p());
        this.X = a(new com.discover.mpos.sdk.transaction.processing.ProcessingData.e());
        this.Y = b(com.discover.mpos.sdk.transaction.processing.ProcessingData.i.f3253a);
    }

    public /* synthetic */ ProcessingData(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.security.SecureCryptAlgorithm secureCryptAlgorithm, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.DefaultContainerContentStorage defaultContainerContentStorage, boolean z2, com.discover.mpos.sdk.data.WriteDataStorageTemplate writeDataStorageTemplate, int i2) {
        this(readerConfiguration, transactionData, (i2 & 4) != 0 ? new com.discover.mpos.sdk.security.SecureCryptAlgorithm() : secureCryptAlgorithm, (i2 & 8) != 0 ? new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.DefaultContainerContentStorage() : defaultContainerContentStorage, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? new com.discover.mpos.sdk.data.WriteDataStorageTemplate() : writeDataStorageTemplate);
    }

    public final byte[] b() {
        byte[] bArr = this.e;
        if (bArr == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return bArr;
    }

    public final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory c() {
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory dataStorageDirectory = this.n;
        if (dataStorageDirectory == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return dataStorageDirectory;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessingData(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.data.external.TransactionExtras transactionExtras) {
        this(readerConfiguration, transactionData, null, null, false, null, 60);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExtras, "");
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = new com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate(transactionExtras.getCandidateData());
        com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration = new com.discover.mpos.sdk.cardreader.config.CombinationConfiguration(candidate.getAid(), candidate.getKernelId(), null, transactionExtras.getCandidateData().getDeferredAuthorizationSupported(), transactionExtras.getCandidateData().getDataStorageSupported(), transactionExtras.getCandidateData().getExtendedLoggingSupported(), transactionExtras.getCandidateData().getTearingRecoverySupported(), transactionExtras.getCandidateData().getDataContainerReadList());
        this.j = a(transactionExtras.getSelectApplicationResponse());
        com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList candidateList = new com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList(kotlin.collections.CollectionsKt.listOf(candidate));
        candidateList.c = candidate;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.h = candidateList;
        com.discover.mpos.sdk.transaction.processing.PreProcessingData preProcessingData = new com.discover.mpos.sdk.transaction.processing.PreProcessingData(transactionData, kotlin.collections.CollectionsKt.emptyList());
        preProcessingData.f3271a.add(kotlin.TuplesKt.to(combinationConfiguration, new com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators(transactionExtras.getPreProcessingIndicatorData())));
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        this.g = preProcessingData;
        this.e = transactionExtras.getUnpredictableNumber();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessingData(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate writeDataStorageUpdate) {
        this(readerConfiguration, writeDataStorageUpdate.getTransactionData(), null, null, true, new com.discover.mpos.sdk.data.WriteDataStorageTemplate(writeDataStorageUpdate.getWriteDataStorageContent()), 12);
        byte[] d2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeDataStorageUpdate, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory dataStorageDirectory = writeDataStorageUpdate.getDataStorageDirectory();
        this.n = new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory((dataStorageDirectory == null || (d2 = dataStorageDirectory.d()) == null) ? new byte[0] : d2, new byte[0], this.b);
        if (writeDataStorageUpdate.getCombinationConfiguration() != null) {
            this.h = new com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList(kotlin.collections.CollectionsKt.listOf(new com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate(writeDataStorageUpdate.getExtendedSelectionData(), writeDataStorageUpdate.getCombinationConfiguration())));
            com.discover.mpos.sdk.transaction.processing.PreProcessingData preProcessingData = new com.discover.mpos.sdk.transaction.processing.PreProcessingData(this.E, kotlin.collections.CollectionsKt.emptyList());
            preProcessingData.f3271a.add(kotlin.TuplesKt.to(writeDataStorageUpdate.getCombinationConfiguration(), writeDataStorageUpdate.getPreProcessingIndicators().copy()));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            this.g = preProcessingData;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessingData(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.cardreader.entrypoint.model.StartDWriteDataStorageUpdate startDWriteDataStorageUpdate) {
        this(readerConfiguration, startDWriteDataStorageUpdate.getWriteDataStorageUpdate());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDWriteDataStorageUpdate, "");
        this.j = a(startDWriteDataStorageUpdate.getSelectApplicationResponse());
        this.e = startDWriteDataStorageUpdate.getUnpredictableNumber();
    }

    private static com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent a(byte[] bArr) {
        return new com.discover.mpos.sdk.card.apdu.processors.selectapplication.SelectApplicationProcessor(new com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor(new com.discover.mpos.sdk.card.apdu.processors.selectapplication.FciProprietaryTemplateSelectApplication(new com.discover.mpos.sdk.card.apdu.processors.selectapplication.IssuerDiscretionaryDataSelectApplication()))).a(bArr);
    }

    public final byte[] k() {
        com.discover.mpos.sdk.core.emv.tlv.Tlv c2 = c(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_CRYPTOGRAM.getTag());
        if (c2 != null) {
            return c2.getContent();
        }
        return null;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv e2 = e(str);
        if (e2 == null) {
            e2 = com.discover.mpos.sdk.b.a.a.a(this.E, str);
        }
        if (e2 != null) {
            return e2;
        }
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = this.j;
        if (selectApplicationResponseContent != null) {
            return selectApplicationResponseContent.a(str);
        }
        return null;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv c2 = c(str);
        return c2 == null ? d(str) : c2;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse = this.k;
        java.lang.Object obj = null;
        if (getProcessingOptionsResponse == null || !getProcessingOptionsResponse.isSuccessful()) {
            return null;
        }
        java.util.Iterator<T> it = getProcessingOptionsResponse.getContent().f2949a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) next).getTag(), str)) {
                obj = next;
                break;
            }
        }
        return (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv d(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), str)) {
                break;
            }
        }
        return (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
    }

    private final com.discover.mpos.sdk.core.emv.tlv.Tlv e(java.lang.String str) {
        com.discover.mpos.sdk.cardreader.config.EntryPointConfigurationData entryPointConfigurationData;
        com.discover.mpos.sdk.core.data.Amount terminalFloorLimit;
        java.lang.String applicationIdentifier;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_COUNTRY_CODE.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_COUNTRY_CODE.getTag(), this.D.getTerminalConfiguration().getCountryCode());
        }
        byte[] bArr = null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_IDENTIFIER_AID_TERMINAL.getTag())) {
            java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_IDENTIFIER_AID_TERMINAL.getTag();
            com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combination$mpos_sdk_card_reader_offlineRegularRelease = this.D.getCombination$mpos_sdk_card_reader_offlineRegularRelease(this.E.getType(), this.h.c);
            if (combination$mpos_sdk_card_reader_offlineRegularRelease != null && (applicationIdentifier = combination$mpos_sdk_card_reader_offlineRegularRelease.getApplicationIdentifier()) != null) {
                bArr = com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(applicationIdentifier);
            }
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag, bArr, 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_FLOOR_LIMIT.getTag())) {
            java.lang.String tag2 = com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_FLOOR_LIMIT.getTag();
            com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combination$mpos_sdk_card_reader_offlineRegularRelease2 = this.D.getCombination$mpos_sdk_card_reader_offlineRegularRelease(this.E.getType(), this.h.c);
            if (combination$mpos_sdk_card_reader_offlineRegularRelease2 != null && (entryPointConfigurationData = combination$mpos_sdk_card_reader_offlineRegularRelease2.getEntryPointConfigurationData()) != null && (terminalFloorLimit = entryPointConfigurationData.getTerminalFloorLimit()) != null) {
                bArr = terminalFloorLimit.getEmvFormattedAmount(this.E.getCurrency());
            }
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag2, bArr, 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_TRANSACTION_QUALIFIERS.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_TRANSACTION_QUALIFIERS.getTag(), m());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.UNPREDICTABLE_NUMBER.getTag())) {
            java.lang.String tag3 = com.discover.mpos.sdk.core.emv.tlv.Tag.UNPREDICTABLE_NUMBER.getTag();
            byte[] bArr2 = this.e;
            if (bArr2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag3, bArr2, 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_TYPE.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_TYPE.getTag(), this.D.getTerminalConfiguration().getTerminalType().getEmvValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_CAPABILITIES.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_CAPABILITIES.getTag(), this.D.getTerminalConfiguration().getCapabilities());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.INTERFACE_DEVICE_IFD_SERIAL_NUMBER.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.INTERFACE_DEVICE_IFD_SERIAL_NUMBER.getTag(), this.D.getInterfaceDeviceIFDSerialNumber());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.VALUE_ADDED_TAX_1.getTag())) {
            return a(com.discover.mpos.sdk.core.emv.tlv.Tag.VALUE_ADDED_TAX_1.getTag(), this.D.getTerminalConfiguration().getValueAddedTax1());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.VALUE_ADDED_TAX_2.getTag())) {
            return a(com.discover.mpos.sdk.core.emv.tlv.Tag.VALUE_ADDED_TAX_2.getTag(), this.D.getTerminalConfiguration().getValueAddedTax2());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.MERCHANT_CATEGORY_CODE.getTag())) {
            return a(com.discover.mpos.sdk.core.emv.tlv.Tag.MERCHANT_CATEGORY_CODE.getTag(), this.D.getTerminalConfiguration().getMerchantCategoryCode());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.MERCHANT_NAME_AND_LOCATION.getTag())) {
            return a(com.discover.mpos.sdk.core.emv.tlv.Tag.MERCHANT_NAME_AND_LOCATION.getTag(), this.D.getTerminalConfiguration().getMerchantNameAndLocation());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_STATUS_INFORMATION.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_STATUS_INFORMATION.getTag(), i());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_VERIFICATION_RESULTS.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_VERIFICATION_RESULTS.getTag(), h());
        }
        return null;
    }

    private static com.discover.mpos.sdk.core.emv.tlv.Tlv a(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(str, str2);
        }
        return null;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s2 = s();
        if (s2 != null) {
            s2.clear();
        }
        this.h.a();
        com.discover.mpos.sdk.transaction.processing.PreProcessingData preProcessingData = this.g;
        if (preProcessingData != null) {
            preProcessingData.a();
        }
        u();
    }

    public final void u() {
        java.util.Iterator<T> it = this.l.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator) it.next()).clear();
        }
        this.l.clear();
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse = this.k;
        if (getProcessingOptionsResponse != null) {
            getProcessingOptionsResponse.clear();
        }
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = this.j;
        if (selectApplicationResponseContent != null) {
            selectApplicationResponseContent.clear();
        }
        com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters = this.f;
        if (outcomeParameters != null) {
            outcomeParameters.clear();
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory dataStorageDirectory = this.n;
        if (dataStorageDirectory != null) {
            if (dataStorageDirectory == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            dataStorageDirectory.clear();
        }
        java.util.Iterator<T> it2 = this.I.iterator();
        while (it2.hasNext()) {
            ((com.discover.mpos.sdk.transaction.processing.ProcessingData.a) it2.next()).a();
        }
    }

    private final <T> com.discover.mpos.sdk.transaction.processing.ProcessingData.a<T> a(kotlin.jvm.functions.Function0<? extends T> function0) {
        com.discover.mpos.sdk.transaction.processing.ProcessingData.a<T> aVar = new com.discover.mpos.sdk.transaction.processing.ProcessingData.a<>(this, function0);
        this.I.add(aVar);
        return aVar;
    }

    private final <T> com.discover.mpos.sdk.transaction.processing.ProcessingData.b<T> b(kotlin.jvm.functions.Function0<? extends T> function0) {
        com.discover.mpos.sdk.transaction.processing.ProcessingData.b<T> bVar = new com.discover.mpos.sdk.transaction.processing.ProcessingData.b<>(this, function0);
        this.I.add(bVar);
        return bVar;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\u0004\u0012\u0002H\u00010\u0002R\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyProperty;", "T", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyOptionalProperty;", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "initializer", "Lkotlin/Function0;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Lkotlin/jvm/functions/Function0;)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    public final class b<T> extends com.discover.mpos.sdk.transaction.processing.ProcessingData.a<T> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.processing.ProcessingData d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, kotlin.jvm.functions.Function0<? extends T> function0) {
            super(processingData, function0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.d = processingData;
        }

        @Override // com.discover.mpos.sdk.transaction.processing.ProcessingData.a
        public final T a(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, kotlin.reflect.KProperty<?> kProperty) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
            T t = (T) super.a(processingData, kProperty);
            kotlin.jvm.internal.Intrinsics.checkNotNull(t);
            return t;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0092\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\u0010\u0005J$\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J,\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/ProcessingData$LazyOptionalProperty;", "T", "", "initializer", "Lkotlin/Function0;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Lkotlin/jvm/functions/Function0;)V", "initialized", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/Object;", "getValue", "thisRef", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "property", "Lkotlin/reflect/KProperty;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "reset", "", "setValue", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    public class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public T f3246a;
        public boolean b;
        final /* synthetic */ com.discover.mpos.sdk.transaction.processing.ProcessingData c;
        private kotlin.jvm.functions.Function0<? extends T> d;

        public a(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, kotlin.jvm.functions.Function0<? extends T> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.c = processingData;
            this.d = function0;
        }

        public final void a() {
            if (this.b) {
                this.b = false;
                T t = this.f3246a;
                if (!(t instanceof com.discover.mpos.sdk.core.emv.Clearable)) {
                    t = null;
                }
                com.discover.mpos.sdk.core.emv.Clearable clearable = (com.discover.mpos.sdk.core.emv.Clearable) t;
                if (clearable != null) {
                    clearable.clear();
                }
            }
        }

        public T a(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, kotlin.reflect.KProperty<?> kProperty) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
            if (!this.b) {
                this.f3246a = this.d.invoke();
                this.b = true;
            }
            return this.f3246a;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class u extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends com.discover.mpos.sdk.core.emv.tlv.Tlv>> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.util.List<? extends com.discover.mpos.sdk.core.emv.tlv.Tlv> invoke() {
            java.util.List flatten = kotlin.collections.CollectionsKt.flatten(com.discover.mpos.sdk.transaction.processing.ProcessingData.this.l);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = flatten.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse) it.next()).getContent().a());
            }
            return arrayList;
        }

        u() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class s extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.transaction.processing.pdol.PdolData> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.transaction.processing.pdol.PdolData invoke() {
            return new com.discover.mpos.sdk.transaction.processing.pdol.PdolData(com.discover.mpos.sdk.transaction.processing.ProcessingData.this.f());
        }

        s() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class r extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate;
            com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect;
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
            byte[] content;
            com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.j;
            return (selectApplicationResponseContent == null || (fciTemplate = selectApplicationResponseContent.f2967a) == null || (proprietaryTemplateDataSelect = fciTemplate.b) == null || (tlv = proprietaryTemplateDataSelect.b) == null || (content = tlv.getContent()) == null) ? new byte[0] : content;
        }

        r() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/data/Track2EquivalentData;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class y extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.data.Track2EquivalentData> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.data.Track2EquivalentData invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv b = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.b(com.discover.mpos.sdk.core.emv.tlv.Tag.TRACK_2_EQUIVALENT_DATA.getTag());
            return new com.discover.mpos.sdk.data.Track2EquivalentData(b != null ? b.getContent() : null);
        }

        y() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class x extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.transaction.processing.ProcessingData.x f3268a = new com.discover.mpos.sdk.transaction.processing.ProcessingData.x();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults invoke() {
            return new com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults();
        }

        x() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class z extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.transaction.processing.ProcessingData.z f3270a = new com.discover.mpos.sdk.transaction.processing.ProcessingData.z();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation invoke() {
            return new com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation();
        }

        z() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv c = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.c(com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_PROCESSING_REQUIREMENTS_CPR.getTag());
            return new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements(c != null ? c.getContent() : null);
        }

        f() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/model/CryptogramInformationData;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class h extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.CryptogramInformationData> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.CryptogramInformationData invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv c = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.c(com.discover.mpos.sdk.core.emv.tlv.Tag.CRYPTOGRAM_INFORMATION_DATA.getTag());
            return new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.CryptogramInformationData(c != null ? c.getContent() : null);
        }

        h() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/ContactlessCardVerificationResults;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class g extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.ContactlessCardVerificationResults> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.ContactlessCardVerificationResults invoke() {
            byte[] content;
            com.discover.mpos.sdk.core.emv.tlv.Tlv c = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.c(com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_APPLICATION_DATA.getTag());
            byte[] bArr = null;
            if (c != null && (content = c.getContent()) != null && content.length >= com.discover.mpos.sdk.transaction.processing.ProcessingData.this.p) {
                bArr = kotlin.collections.ArraysKt.copyOfRange(content, com.discover.mpos.sdk.transaction.processing.ProcessingData.this.f3245o, com.discover.mpos.sdk.transaction.processing.ProcessingData.this.p);
            }
            return new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.ContactlessCardVerificationResults(bArr);
        }

        g() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class l extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.lang.String invoke() {
            java.lang.String aid;
            com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.h.c;
            return (candidate == null || (aid = candidate.getAid()) == null) ? "" : aid;
        }

        l() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class w extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers invoke() {
            com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.n().getTerminalTransactionQualifiers();
            if (terminalTransactionQualifiers != null) {
                return terminalTransactionQualifiers;
            }
            return new com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers(null, 1, 0 == true ? 1 : 0);
        }

        w() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/config/FormFactorIdentifier;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class o extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.transaction.processing.ProcessingData.o f3259a = new com.discover.mpos.sdk.transaction.processing.ProcessingData.o();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier invoke() {
            return new com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier(null, 1, 0 == true ? 1 : 0);
        }

        o() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class t extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators invoke() {
            java.util.List<kotlin.Pair<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators>> list;
            java.lang.Object obj;
            com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators;
            com.discover.mpos.sdk.transaction.processing.PreProcessingData preProcessingData = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.g;
            if (preProcessingData != null && (list = preProcessingData.f3271a) != null) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    kotlin.Pair pair = (kotlin.Pair) next;
                    java.lang.String kernelId = ((com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) pair.getFirst()).getKernelId();
                    com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.h.c;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kernelId, candidate != null ? candidate.getKernelId() : null)) {
                        java.lang.String applicationIdentifier = ((com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) pair.getFirst()).getApplicationIdentifier();
                        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate2 = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.h.c;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(applicationIdentifier, candidate2 != null ? candidate2.getAid() : null)) {
                            obj = next;
                            break;
                        }
                    }
                }
                kotlin.Pair pair2 = (kotlin.Pair) obj;
                if (pair2 != null && (preProcessingIndicators = (com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) pair2.getSecond()) != null) {
                    return preProcessingIndicators;
                }
            }
            return new com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators(null, false, false, false, false, false, 63, null);
        }

        t() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class m extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends byte[]>> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.util.List<? extends byte[]> invoke() {
            java.util.List<java.lang.String> exceptionFile = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.D.getTerminalConfiguration().getExceptionFile();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(exceptionFile, 10));
            java.util.Iterator<T> it = exceptionFile.iterator();
            while (it.hasNext()) {
                arrayList.add(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toNumByteArray((java.lang.String) it.next()));
            }
            return arrayList;
        }

        m() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/core/data/Amount;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class q extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.core.data.Amount> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.core.data.Amount invoke() {
            byte[] content;
            com.discover.mpos.sdk.core.emv.tlv.Tlv b = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.b(com.discover.mpos.sdk.core.emv.tlv.Tag.OFFLINE_BALANCE_FOR_D_PAS.getTag());
            if (b == null || (content = b.getContent()) == null) {
                return null;
            }
            return new com.discover.mpos.sdk.core.data.Amount(content, com.discover.mpos.sdk.transaction.processing.ProcessingData.this.E.getCurrency());
        }

        q() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class j extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate;
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
            com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.j;
            if (selectApplicationResponseContent == null || (fciTemplate = selectApplicationResponseContent.f2967a) == null || (tlv = fciTemplate.f2936a) == null) {
                return null;
            }
            return tlv.getContent();
        }

        j() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class v extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.core.emv.tlv.Tlv> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.core.emv.tlv.Tlv invoke() {
            return com.discover.mpos.sdk.transaction.processing.ProcessingData.this.b(com.discover.mpos.sdk.core.emv.tlv.Tag.STATIC_DATA_AUTHENTICATION_TAG_LIST.getTag());
        }

        v() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/data/CardDate;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.data.CardDate> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.data.CardDate invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv b = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.b(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_EFFECTIVE_DATE.getTag());
            return new com.discover.mpos.sdk.data.CardDate(b != null ? b.getContent() : null);
        }

        c() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/data/CardDate;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class n extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.data.CardDate> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.data.CardDate invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv d = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.d(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_EXPIRATION_DATE.getTag());
            new java.lang.Object[]{java.lang.Boolean.valueOf(d != null)};
            new java.lang.Object[]{d};
            if (d != null) {
                return new com.discover.mpos.sdk.data.CardDate(d.getContent());
            }
            com.discover.mpos.sdk.data.CardDate cardDate = (com.discover.mpos.sdk.data.CardDate) com.discover.mpos.sdk.transaction.processing.ProcessingData.this.g().e.getValue();
            new java.lang.Object[]{java.lang.Boolean.valueOf(cardDate != null)};
            new java.lang.Object[]{cardDate};
            return cardDate;
        }

        n() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class k extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            if (!com.discover.mpos.sdk.transaction.processing.ProcessingData.this.y) {
                return null;
            }
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder byteArrayBuilder = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
            byteArrayBuilder.append(com.discover.mpos.sdk.transaction.processing.ProcessingData.this.t());
            if (com.discover.mpos.sdk.transaction.processing.ProcessingData.this.s() != null) {
                java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_DESCRIPTOR.getTag();
                com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.s();
                byteArrayBuilder.append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag, s != null ? s.getE() : null, 0, 0, 12, null));
            }
            byte[] e = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.c().getE();
            if (e.length != 0) {
                byteArrayBuilder.append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.DATA_STORAGE_DIRECTORY.getTag(), e, 0, 0, 12, null));
            }
            byteArrayBuilder.append(com.discover.mpos.sdk.transaction.processing.ProcessingData.this.a());
            byteArrayBuilder.append(com.discover.mpos.sdk.transaction.processing.ProcessingData.this.v());
            return byteArrayBuilder.build();
        }

        k() {
            super(0);
        }
    }

    public final boolean p() {
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = this.h.c;
        if (candidate != null) {
            return candidate.getTearingRecoverySupported();
        }
        return false;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv a2;
            byte[] content;
            com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.j;
            if (selectApplicationResponseContent == null || (a2 = selectApplicationResponseContent.a(com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_DESCRIPTOR.getTag())) == null || (content = a2.getContent()) == null) {
                return null;
            }
            return new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor(content);
        }

        d() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class p extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.core.emv.tlv.Tlv> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.core.emv.tlv.Tlv invoke() {
            com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.j;
            if (selectApplicationResponseContent != null) {
                return selectApplicationResponseContent.a(com.discover.mpos.sdk.core.emv.tlv.Tag.FORM_FACTOR_IDENTIFIER.getTag());
            }
            return null;
        }

        p() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.core.emv.tlv.Tlv> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.core.emv.tlv.Tlv invoke() {
            com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = com.discover.mpos.sdk.transaction.processing.ProcessingData.this.j;
            if (selectApplicationResponseContent != null) {
                return selectApplicationResponseContent.a(com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_VERSION_NUMBER.getTag());
            }
            return null;
        }

        e() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/DataStorageWriteResult;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class i extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.transaction.processing.ProcessingData.i f3253a = new com.discover.mpos.sdk.transaction.processing.ProcessingData.i();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult invoke() {
            return new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult();
        }

        i() {
            super(0);
        }
    }

    public final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds q() {
        java.util.ArrayList emptyList;
        java.util.List<byte[]> dataContainerReadList;
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = this.h.c;
        if (candidate == null || (dataContainerReadList = candidate.getDataContainerReadList()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<byte[]> list = dataContainerReadList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds.a((byte[]) it.next()));
            }
            emptyList = arrayList;
        }
        return new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds(emptyList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult v() {
        return (com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult) this.Y.a(this, f3244a[23]);
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv t() {
        return (com.discover.mpos.sdk.core.emv.tlv.Tlv) this.X.a(this, f3244a[22]);
    }

    public final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s() {
        return (com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor) this.B.a(this, f3244a[20]);
    }

    public final byte[] r() {
        return (byte[]) this.V.a(this, f3244a[19]);
    }

    public final java.util.List<byte[]> o() {
        return (java.util.List) this.U.a(this, f3244a[13]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators n() {
        return (com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) this.T.a(this, f3244a[12]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers m() {
        return (com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers) this.R.a(this, f3244a[10]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.CryptogramInformationData l() {
        return (com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.CryptogramInformationData) this.Q.a(this, f3244a[7]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements j() {
        return (com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements) this.P.a(this, f3244a[6]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation i() {
        return (com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation) this.O.a(this, f3244a[5]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration = this.D;
        int hashCode = readerConfiguration != null ? readerConfiguration.hashCode() : 0;
        com.discover.mpos.sdk.transaction.TransactionData transactionData = this.E;
        int hashCode2 = transactionData != null ? transactionData.hashCode() : 0;
        com.discover.mpos.sdk.security.CryptAlgorithm cryptAlgorithm = this.F;
        int hashCode3 = cryptAlgorithm != null ? cryptAlgorithm.hashCode() : 0;
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage containerContentStorage = this.Z;
        int hashCode4 = containerContentStorage != null ? containerContentStorage.hashCode() : 0;
        boolean z2 = this.G;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        com.discover.mpos.sdk.data.WriteDataStorageTemplate writeDataStorageTemplate = this.H;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + (writeDataStorageTemplate != null ? writeDataStorageTemplate.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h() {
        return (com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults) this.N.a(this, f3244a[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.data.Track2EquivalentData g() {
        return (com.discover.mpos.sdk.data.Track2EquivalentData) this.M.a(this, f3244a[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] f() {
        return (byte[]) this.L.a(this, f3244a[2]);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.processing.ProcessingData)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.processing.ProcessingData processingData = (com.discover.mpos.sdk.transaction.processing.ProcessingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.D, processingData.D) && kotlin.jvm.internal.Intrinsics.areEqual(this.E, processingData.E) && kotlin.jvm.internal.Intrinsics.areEqual(this.F, processingData.F) && kotlin.jvm.internal.Intrinsics.areEqual(this.Z, processingData.Z) && this.G == processingData.G && kotlin.jvm.internal.Intrinsics.areEqual(this.H, processingData.H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.discover.mpos.sdk.transaction.processing.pdol.PdolData e() {
        return (com.discover.mpos.sdk.transaction.processing.pdol.PdolData) this.K.a(this, f3244a[1]);
    }

    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> d() {
        return (java.util.List) this.J.a(this, f3244a[0]);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage
    public final void a(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent containerContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerContent, "");
        this.Z.a(containerContent);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage
    public final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent> a() {
        return this.Z.a();
    }
}
