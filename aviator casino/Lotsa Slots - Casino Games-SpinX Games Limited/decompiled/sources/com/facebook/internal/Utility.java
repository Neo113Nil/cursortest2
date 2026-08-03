package com.facebook.internal;

/* compiled from: Utility.kt */
@kotlin.Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002â\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010@\u001a\u00020AH\u0002J \u0010B\u001a\u00020;2\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>2\u0006\u0010@\u001a\u00020AH\u0002J'\u0010C\u001a\u00020*\"\u0004\b\u0000\u0010D2\b\u0010E\u001a\u0004\u0018\u0001HD2\b\u0010F\u001a\u0004\u0018\u0001HDH\u0007¢\u0006\u0002\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\"2\u0006\u0010I\u001a\u00020\u0004H\u0007J&\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u00042\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010N\u001a\u0004\u0018\u00010OH\u0007J\u0018\u0010P\u001a\u00020;2\u0006\u0010@\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u0004H\u0002J\u0010\u0010R\u001a\u00020;2\u0006\u0010@\u001a\u00020AH\u0007J\u0012\u0010S\u001a\u00020;2\b\u0010T\u001a\u0004\u0018\u00010UH\u0007J\u001e\u0010V\u001a\u0004\u0018\u00010\u00042\b\u0010W\u001a\u0004\u0018\u00010\u00042\b\u0010X\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010Y\u001a\u00020\u00132\u0006\u0010Z\u001a\u00020[H\u0002J&\u0010\\\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010]j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`^2\b\u0010_\u001a\u0004\u0018\u00010`H\u0007J\u0016\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040b2\u0006\u0010_\u001a\u00020`H\u0007J\u001c\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010d2\u0006\u0010e\u001a\u00020\"H\u0007J\u001c\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040d2\u0006\u0010e\u001a\u00020\"H\u0007J\u001a\u0010g\u001a\u00020\u00062\b\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010j\u001a\u00020kH\u0007J\u0012\u0010l\u001a\u00020;2\b\u0010m\u001a\u0004\u0018\u00010nH\u0007J\b\u0010o\u001a\u00020*H\u0002J\u0010\u0010p\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0006H\u0007J\u0012\u0010r\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010AH\u0007J\u0010\u0010s\u001a\u00020\u00042\u0006\u0010@\u001a\u00020AH\u0007J\n\u0010t\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010u\u001a\u0004\u0018\u00010v2\b\u0010w\u001a\u0004\u0018\u00010O2\b\u0010x\u001a\u0004\u0018\u00010\u00042\u0006\u0010y\u001a\u00020vH\u0007J\u0010\u0010z\u001a\u00020\u00132\u0006\u0010{\u001a\u00020KH\u0007J\n\u0010|\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010}\u001a\u00020\u00042\b\u0010~\u001a\u0004\u0018\u00010\u0004H\u0007J\u0011\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u0010I\u001a\u00020\u0004H\u0002J\u001b\u0010\u0081\u0001\u001a\u00020;2\u0006\u0010I\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0007J\u0013\u0010\u0084\u0001\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010AH\u0007JM\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\f\u0010\u0087\u0001\u001a\u0007\u0012\u0002\b\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u00042\"\u0010\u008a\u0001\u001a\u0012\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0088\u00010\u008b\u0001\"\t\u0012\u0002\b\u0003\u0018\u00010\u0088\u0001H\u0007¢\u0006\u0003\u0010\u008c\u0001JH\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u00042\u0007\u0010\u0089\u0001\u001a\u00020\u00042\"\u0010\u008a\u0001\u001a\u0012\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0088\u00010\u008b\u0001\"\t\u0012\u0002\b\u0003\u0018\u00010\u0088\u0001H\u0007¢\u0006\u0003\u0010\u008e\u0001J\u0014\u0010\u008f\u0001\u001a\u00020\u00042\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010e\u001a\u00020\"2\b\u0010x\u001a\u0004\u0018\u00010\u00042\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010KH\u0007J\u001c\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010Z\u001a\u00030\u0098\u0001H\u0002J\u001d\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u009a\u0001\u001a\u00020\u00042\u0007\u0010Z\u001a\u00030\u0098\u0001H\u0002J\u001c\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u009a\u0001\u001a\u00020\u00042\u0006\u0010x\u001a\u00020\u0004H\u0002J@\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u009d\u0001\u001a\u00030\u0086\u00012\u0018\u0010\u009e\u0001\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u008b\u0001\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0007J\u0011\u0010¡\u0001\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0007J\u0014\u0010¢\u0001\u001a\u00020*2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010KH\u0007J\u0015\u0010£\u0001\u001a\u00020*2\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0007J\u0014\u0010¦\u0001\u001a\u00020*2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010KH\u0007J\u0011\u0010§\u0001\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0002J\u0013\u0010¨\u0001\u001a\u00020*2\b\u0010W\u001a\u0004\u0018\u00010\u0004H\u0007J\u0019\u0010¨\u0001\u001a\u00020*2\u000e\u0010©\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010ª\u0001H\u0007J\u0014\u0010«\u0001\u001a\u00020*2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010KH\u0007J\u0018\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u00ad\u00012\u0006\u0010_\u001a\u00020`H\u0007J\u0017\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040b2\u0006\u0010_\u001a\u00020`H\u0007J\u001e\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040d2\u0007\u0010°\u0001\u001a\u00020\u0004H\u0007J'\u0010±\u0001\u001a\u00020;2\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00042\u0011\u0010³\u0001\u001a\f\u0018\u00010´\u0001j\u0005\u0018\u0001`µ\u0001H\u0007J\u001f\u0010±\u0001\u001a\u00020;2\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J+\u0010±\u0001\u001a\u00020;2\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u00042\n\u0010·\u0001\u001a\u0005\u0018\u00010¸\u0001H\u0007J\"\u0010¹\u0001\u001a\u00020\u00042\u0017\u0010º\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040dH\u0007J\u0013\u0010»\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020\u0004H\u0007J\u0011\u0010¼\u0001\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0007J\u0014\u0010½\u0001\u001a\u00020O2\t\u0010¾\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J.\u0010¿\u0001\u001a\u00020;2\u0006\u0010F\u001a\u00020O2\b\u0010x\u001a\u0004\u0018\u00010\u00042\u0011\u0010À\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010bH\u0007J&\u0010Á\u0001\u001a\u00020*2\u0006\u0010w\u001a\u00020O2\b\u0010x\u001a\u0004\u0018\u00010\u00042\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0001H\u0007J&\u0010Ã\u0001\u001a\u00020;2\u0006\u0010F\u001a\u00020O2\b\u0010x\u001a\u0004\u0018\u00010\u00042\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010Ä\u0001\u001a\u00020;2\u0006\u0010F\u001a\u00020O2\b\u0010x\u001a\u0004\u0018\u00010\u00042\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010KH\u0007J!\u0010Å\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010d2\b\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0007J\u0013\u0010È\u0001\u001a\u00020\u00042\b\u0010h\u001a\u0004\u0018\u00010iH\u0007J%\u0010É\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010d2\b\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0007J\t\u0010Ê\u0001\u001a\u00020;H\u0002J\t\u0010Ë\u0001\u001a\u00020\u0006H\u0002J\u0012\u0010Ì\u0001\u001a\u00020;2\u0007\u0010Í\u0001\u001a\u00020AH\u0002J\u0012\u0010Î\u0001\u001a\u00020;2\u0007\u0010Í\u0001\u001a\u00020AH\u0002J\t\u0010Ï\u0001\u001a\u00020;H\u0002J\t\u0010Ð\u0001\u001a\u00020;H\u0002J\u0015\u0010Ñ\u0001\u001a\u00020;2\n\u0010Ò\u0001\u001a\u0005\u0018\u00010Ó\u0001H\u0007J\u001f\u0010Ô\u0001\u001a\u00020\u00042\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\"2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010×\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020\"2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010\u00042\u0007\u0010Ø\u0001\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0007J\u001a\u0010Ù\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020\"2\u0007\u0010Í\u0001\u001a\u00020AH\u0007J\u0014\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010Z\u001a\u00030\u0098\u0001H\u0007J\u0013\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020\u0004H\u0007J\u0016\u0010Û\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010Z\u001a\u0005\u0018\u00010\u0098\u0001H\u0007J\u0015\u0010Û\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010x\u001a\u0004\u0018\u00010\u0004H\u0007J\u001d\u0010Ü\u0001\u001a\u00020*2\b\u0010E\u001a\u0004\u0018\u00010\u00042\b\u0010F\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010Ý\u0001\u001a\u0004\u0018\u00010`2\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\"2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010ß\u0001\u001a\u0004\u0018\u00010\"2\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\"2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J*\u0010à\u0001\u001a\u00020;2\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0015\u0010º\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010dH\u0007J.\u0010á\u0001\u001a\u00020;2\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0019\u0010º\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u000e\u0010(\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b)\u0010,R\u0011\u0010-\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b-\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R\u000e\u00102\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u00103\u001a\u0004\u0018\u00010\u001e8G¢\u0006\u0006\u001a\u0004\b4\u0010 R\u000e\u00105\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001c¨\u0006ã\u0001"}, d2 = {"Lcom/facebook/internal/Utility;", "", "()V", "ARC_DEVICE_PATTERN", "", "DEFAULT_STREAM_BUFFER_SIZE", "", "EXTRA_APP_EVENTS_INFO_FORMAT_VERSION", "FACEBOOK_PROFILE_FIELDS", "HASH_ALGORITHM_MD5", "HASH_ALGORITHM_SHA1", "HASH_ALGORITHM_SHA256", "INSTAGRAM_PROFILE_FIELDS", "LOG_TAG", "NO_CARRIER", "REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS", "URL_SCHEME", "UTF8", "availableExternalStorageGB", "", "getAvailableExternalStorageGB", "()J", "setAvailableExternalStorageGB", "(J)V", "carrierName", "getCarrierName", "()Ljava/lang/String;", "setCarrierName", "(Ljava/lang/String;)V", "currentLocale", "Ljava/util/Locale;", "getCurrentLocale", "()Ljava/util/Locale;", "dataProcessingOptions", "Lorg/json/JSONObject;", "getDataProcessingOptions", "()Lorg/json/JSONObject;", "deviceTimeZoneName", "getDeviceTimeZoneName", "setDeviceTimeZoneName", "deviceTimezoneAbbreviation", "isAutoAppLinkSetup", "", "isAutoAppLinkSetup$annotations", "()Z", "isDataProcessingRestricted", "locale", "getLocale", "setLocale", "(Ljava/util/Locale;)V", "numCPUCores", "resourceLocale", "getResourceLocale", "timestampOfLastCheck", "totalExternalStorageGB", "versionName", "getVersionName", "setVersionName", "appendAnonIdUnderCompliance", "", "params", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "context", "Landroid/content/Context;", "appendAttributionIdUnderCompliance", "areObjectsEqual", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "awaitGetGraphMeRequestWithCache", "accessToken", "buildUri", "Landroid/net/Uri;", "authority", "path", "parameters", "Landroid/os/Bundle;", "clearCookiesForDomain", com.ironsource.X3.j.D, "clearFacebookCookies", "closeQuietly", "closeable", "Ljava/io/Closeable;", "coerceValueIfNullOrEmpty", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "valueIfNullOrEmpty", "convertBytesToGB", "bytes", "", "convertJSONArrayToHashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "jsonArray", "Lorg/json/JSONArray;", "convertJSONArrayToList", "", "convertJSONObjectToHashMap", "", "jsonObject", "convertJSONObjectToStringMap", "copyAndCloseInputStream", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "disconnectQuietly", "connection", "Ljava/net/URLConnection;", "externalStorageExists", "generateRandomString", "length", "getActivityName", "getAppName", "getAppVersion", "getBundleLongAsDate", "Ljava/util/Date;", "bundle", com.ironsource.X3.i.W, "dateBase", "getContentSize", "contentUri", "getCurrentTokenDomainWithDefault", "getGraphDomainFromTokenDomain", "tokenGraphDomain", "getGraphMeRequestWithCache", "Lcom/facebook/GraphRequest;", "getGraphMeRequestWithCacheAsync", "callback", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "getMetadataApplicationId", "getMethodQuietly", "Ljava/lang/reflect/Method;", "clazz", "Ljava/lang/Class;", "methodName", "parameterTypes", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getProfileFieldsForGraphDomain", "graphDomain", "getStringPropertyAsJSON", "nonJSONPropertyKey", "getUriString", com.facebook.share.internal.ShareConstants.MEDIA_URI, "hashBytes", "hash", "Ljava/security/MessageDigest;", "", "hashWithAlgorithm", "algorithm", "invokeMethodQuietly", "receiver", "method", "args", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "isAutofillAvailable", "isChromeOS", "isContentUri", "isCurrentAccessToken", "token", "Lcom/facebook/AccessToken;", "isFileUri", "isGooglePlayServicesAvailable", "isNullOrEmpty", "c", "", "isWebUri", "jsonArrayToSet", "", "jsonArrayToStringList", "jsonStrToMap", "str", "logd", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "t", "", "mapToJsonStr", "map", "md5hash", "mustFixWindowParamsForAutofill", "parseUrlQueryString", "queryString", "putCommaSeparatedStringList", "list", "putJSONValueInBundle", "value", "putNonEmptyString", "putUri", "readNonnullStringMapFromParcel", "parcel", "Landroid/os/Parcel;", "readStreamToString", "readStringMapFromParcel", "refreshAvailableExternalStorage", "refreshBestGuessNumberOfCPUCores", "refreshCarrierName", "appContext", "refreshPeriodicExtendedDeviceInfo", "refreshTimezone", "refreshTotalExternalStorage", "runOnNonUiThread", "runnable", "Ljava/lang/Runnable;", "safeGetStringFromResponse", com.ironsource.Ve.n, "propertyName", "setAppEventAttributionParameters", "limitEventUsage", "setAppEventExtendedDeviceInfoParameters", "sha1hash", "sha256hash", "stringsEqualOrEmpty", "tryGetJSONArrayFromResponse", "propertyKey", "tryGetJSONObjectFromResponse", "writeNonnullStringMapToParcel", "writeStringMapToParcel", "GraphMeRequestWithCacheCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Utility {
    private static final java.lang.String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final java.lang.String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
    private static final java.lang.String FACEBOOK_PROFILE_FIELDS = "id,name,first_name,middle_name,last_name";
    private static final java.lang.String HASH_ALGORITHM_MD5 = "MD5";
    private static final java.lang.String HASH_ALGORITHM_SHA1 = "SHA-1";
    private static final java.lang.String HASH_ALGORITHM_SHA256 = "SHA-256";
    private static final java.lang.String INSTAGRAM_PROFILE_FIELDS = "id,name,profile_picture";
    public static final java.lang.String LOG_TAG = "FacebookSDK";
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 1800000;
    private static final java.lang.String URL_SCHEME = "https";
    private static final java.lang.String UTF8 = "UTF-8";
    private static java.util.Locale locale;
    private static int numCPUCores;
    public static final com.facebook.internal.Utility INSTANCE = new com.facebook.internal.Utility();
    private static long timestampOfLastCheck = -1;
    private static long totalExternalStorageGB = -1;
    private static long availableExternalStorageGB = -1;
    private static java.lang.String deviceTimezoneAbbreviation = "";
    private static java.lang.String deviceTimeZoneName = "";
    private static final java.lang.String NO_CARRIER = "NoCarrier";
    private static java.lang.String carrierName = NO_CARRIER;
    private static java.lang.String versionName = "";

    /* compiled from: Utility.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "", "onFailure", "", "error", "Lcom/facebook/FacebookException;", "onSuccess", "userInfo", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface GraphMeRequestWithCacheCallback {
        void onFailure(com.facebook.FacebookException error);

        void onSuccess(org.json.JSONObject userInfo);
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void isAutoAppLinkSetup$annotations() {
    }

    private Utility() {
    }

    public final long getAvailableExternalStorageGB() {
        return availableExternalStorageGB;
    }

    public final void setAvailableExternalStorageGB(long j) {
        availableExternalStorageGB = j;
    }

    public final java.lang.String getDeviceTimeZoneName() {
        return deviceTimeZoneName;
    }

    public final void setDeviceTimeZoneName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        deviceTimeZoneName = str;
    }

    public final java.lang.String getCarrierName() {
        return carrierName;
    }

    public final void setCarrierName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        carrierName = str;
    }

    public final java.lang.String getVersionName() {
        return versionName;
    }

    public final void setVersionName(java.lang.String str) {
        versionName = str;
    }

    public final java.util.Locale getLocale() {
        return locale;
    }

    public final void setLocale(java.util.Locale locale2) {
        locale = locale2;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isNullOrEmpty(java.util.Collection<?> c) {
        return c == null || c.isEmpty();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isNullOrEmpty(java.lang.String s) {
        return s == null || s.length() == 0;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String coerceValueIfNullOrEmpty(java.lang.String s, java.lang.String valueIfNullOrEmpty) {
        return isNullOrEmpty(s) ? valueIfNullOrEmpty : s;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String md5hash(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_MD5, key);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sha1hash(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.hashWithAlgorithm("SHA-1", key);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sha1hash(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return INSTANCE.hashWithAlgorithm("SHA-1", bytes);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sha256hash(java.lang.String key) {
        if (key == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, key);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sha256hash(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, bytes);
    }

    private final java.lang.String hashWithAlgorithm(java.lang.String algorithm, java.lang.String key) {
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        if (key == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = key.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return hashWithAlgorithm(algorithm, bytes);
    }

    private final java.lang.String hashWithAlgorithm(java.lang.String algorithm, byte[] bytes) {
        try {
            java.security.MessageDigest hash = java.security.MessageDigest.getInstance(algorithm);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return hashBytes(hash, bytes);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final java.lang.String hashBytes(java.security.MessageDigest hash, byte[] bytes) {
        hash.update(bytes);
        byte[] digest = hash.digest();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest");
        int length = digest.length;
        int i = 0;
        while (i < length) {
            byte b = digest[i];
            i++;
            sb.append(java.lang.Integer.toHexString((b >> 4) & 15));
            sb.append(java.lang.Integer.toHexString(b & com.google.common.base.Ascii.SI));
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    @kotlin.jvm.JvmStatic
    public static final android.net.Uri buildUri(java.lang.String authority, java.lang.String path, android.os.Bundle parameters) {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(authority);
        builder.path(path);
        if (parameters != null) {
            for (java.lang.String str : parameters.keySet()) {
                java.lang.Object obj = parameters.get(str);
                if (obj instanceof java.lang.String) {
                    builder.appendQueryParameter(str, (java.lang.String) obj);
                }
            }
        }
        android.net.Uri build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle parseUrlQueryString(java.lang.String queryString) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!isNullOrEmpty(queryString)) {
            if (queryString == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            java.lang.Object[] array = kotlin.text.StringsKt.split$default((java.lang.CharSequence) queryString, new java.lang.String[]{com.ironsource.X3.j.c}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            if (array != null) {
                java.lang.String[] strArr = (java.lang.String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    java.lang.String str = strArr[i];
                    i++;
                    java.lang.Object[] array2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.ironsource.X3.j.b}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                    if (array2 != null) {
                        java.lang.String[] strArr2 = (java.lang.String[]) array2;
                        try {
                            if (strArr2.length == 2) {
                                bundle.putString(java.net.URLDecoder.decode(strArr2[0], "UTF-8"), java.net.URLDecoder.decode(strArr2[1], "UTF-8"));
                            } else if (strArr2.length == 1) {
                                bundle.putString(java.net.URLDecoder.decode(strArr2[0], "UTF-8"), "");
                            }
                        } catch (java.io.UnsupportedEncodingException e) {
                            logd(LOG_TAG, e);
                        }
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final void putNonEmptyString(android.os.Bundle b, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        if (isNullOrEmpty(value)) {
            return;
        }
        b.putString(key, value);
    }

    @kotlin.jvm.JvmStatic
    public static final void putCommaSeparatedStringList(android.os.Bundle b, java.lang.String key, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        if (list != null) {
            b.putString(key, android.text.TextUtils.join(",", list));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void putUri(android.os.Bundle b, java.lang.String key, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        if (uri != null) {
            putNonEmptyString(b, key, uri.toString());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean putJSONValueInBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (value == null) {
            bundle.remove(key);
            return true;
        }
        if (value instanceof java.lang.Boolean) {
            bundle.putBoolean(key, ((java.lang.Boolean) value).booleanValue());
            return true;
        }
        if (value instanceof boolean[]) {
            bundle.putBooleanArray(key, (boolean[]) value);
            return true;
        }
        if (value instanceof java.lang.Double) {
            bundle.putDouble(key, ((java.lang.Number) value).doubleValue());
            return true;
        }
        if (value instanceof double[]) {
            bundle.putDoubleArray(key, (double[]) value);
            return true;
        }
        if (value instanceof java.lang.Integer) {
            bundle.putInt(key, ((java.lang.Number) value).intValue());
            return true;
        }
        if (value instanceof int[]) {
            bundle.putIntArray(key, (int[]) value);
            return true;
        }
        if (value instanceof java.lang.Long) {
            bundle.putLong(key, ((java.lang.Number) value).longValue());
            return true;
        }
        if (value instanceof long[]) {
            bundle.putLongArray(key, (long[]) value);
            return true;
        }
        if (value instanceof java.lang.String) {
            bundle.putString(key, (java.lang.String) value);
            return true;
        }
        if (value instanceof org.json.JSONArray) {
            bundle.putString(key, ((org.json.JSONArray) value).toString());
            return true;
        }
        if (!(value instanceof org.json.JSONObject)) {
            return false;
        }
        bundle.putString(key, ((org.json.JSONObject) value).toString());
        return true;
    }

    @kotlin.jvm.JvmStatic
    public static final void closeQuietly(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void disconnectQuietly(java.net.URLConnection connection) {
        if (connection == null || !(connection instanceof java.net.HttpURLConnection)) {
            return;
        }
        ((java.net.HttpURLConnection) connection).disconnect();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getMetadataApplicationId(android.content.Context context) {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notNull(context, "context");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        return com.facebook.FacebookSdk.getApplicationId();
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.Object> convertJSONObjectToHashMap(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    java.lang.String string = names.getString(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    java.lang.Object value = jsonObject.get(string);
                    if (value instanceof org.json.JSONObject) {
                        value = convertJSONObjectToHashMap((org.json.JSONObject) value);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (org.json.JSONException unused) {
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.String> convertJSONObjectToStringMap(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            java.lang.String key = keys.next();
            java.lang.String optString = jsonObject.optString(key);
            if (optString != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.HashSet<java.lang.String> convertJSONArrayToHashSet(org.json.JSONArray jsonArray) {
        if (jsonArray == null || jsonArray.length() == 0) {
            return null;
        }
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        int length = jsonArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                java.lang.String string = jsonArray.getString(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashSet;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> convertJSONArrayToList(org.json.JSONArray jsonArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jsonArray.length();
            if (length <= 0) {
                return arrayList;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                java.lang.String string = jsonArray.getString(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i2 >= length) {
                    return arrayList;
                }
                i = i2;
            }
        } catch (org.json.JSONException unused) {
            return new java.util.ArrayList();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Object getStringPropertyAsJSON(org.json.JSONObject jsonObject, java.lang.String key, java.lang.String nonJSONPropertyKey) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        java.lang.Object opt = jsonObject.opt(key);
        if (opt != null && (opt instanceof java.lang.String)) {
            opt = new org.json.JSONTokener((java.lang.String) opt).nextValue();
        }
        if (opt == null || (opt instanceof org.json.JSONObject) || (opt instanceof org.json.JSONArray)) {
            return opt;
        }
        if (nonJSONPropertyKey != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(nonJSONPropertyKey, opt);
            return jSONObject;
        }
        throw new com.facebook.FacebookException("Got an unexpected non-JSON object.");
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String readStreamToString(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Throwable th;
        java.io.InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            try {
                inputStreamReader = new java.io.InputStreamReader(bufferedInputStream);
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            java.lang.String sb2 = sb.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            closeQuietly(bufferedInputStream);
                            closeQuietly(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    closeQuietly(bufferedInputStream);
                    closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (java.lang.Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int copyAndCloseInputStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean stringsEqualOrEmpty(java.lang.String a2, java.lang.String b) {
        java.lang.String str = a2;
        boolean z = str == null || str.length() == 0;
        java.lang.String str2 = b;
        boolean z2 = str2 == null || str2.length() == 0;
        if (z && z2) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(a2, b);
    }

    private final void clearCookiesForDomain(android.content.Context context, java.lang.String domain) {
        android.webkit.CookieSyncManager.createInstance(context).sync();
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        java.lang.String cookie = cookieManager.getCookie(domain);
        if (cookie == null) {
            return;
        }
        java.lang.Object[] array = kotlin.text.StringsKt.split$default((java.lang.CharSequence) cookie, new java.lang.String[]{";"}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
        if (array != null) {
            java.lang.String[] strArr = (java.lang.String[]) array;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                java.lang.String str = strArr[i];
                i++;
                java.lang.Object[] array2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.ironsource.X3.j.b}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                if (array2 != null) {
                    java.lang.String[] strArr2 = (java.lang.String[]) array2;
                    if (strArr2.length > 0) {
                        java.lang.String str2 = strArr2[0];
                        int length2 = str2.length() - 1;
                        int i2 = 0;
                        boolean z = false;
                        while (i2 <= length2) {
                            boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z ? i2 : length2), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                } else {
                                    length2--;
                                }
                            } else if (z2) {
                                i2++;
                            } else {
                                z = true;
                            }
                        }
                        cookieManager.setCookie(domain, kotlin.jvm.internal.Intrinsics.stringPlus(str2.subSequence(i2, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                    }
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @kotlin.jvm.JvmStatic
    public static final void clearFacebookCookies(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.facebook.internal.Utility utility = INSTANCE;
            utility.clearCookiesForDomain(context, com.facebook.FacebookSdk.FACEBOOK_COM);
            utility.clearCookiesForDomain(context, ".facebook.com");
            utility.clearCookiesForDomain(context, "https://facebook.com");
            utility.clearCookiesForDomain(context, "https://.facebook.com");
        } catch (java.lang.Exception unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void logd(java.lang.String tag, java.lang.Exception e) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!com.facebook.FacebookSdk.isDebugEnabled() || tag == null || e == null) {
            return;
        }
        android.util.Log.d(tag, e.getClass().getSimpleName() + ": " + ((java.lang.Object) e.getMessage()));
    }

    @kotlin.jvm.JvmStatic
    public static final void logd(java.lang.String tag, java.lang.String msg) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!com.facebook.FacebookSdk.isDebugEnabled() || tag == null || msg == null) {
            return;
        }
        android.util.Log.d(tag, msg);
    }

    @kotlin.jvm.JvmStatic
    public static final void logd(java.lang.String tag, java.lang.String msg, java.lang.Throwable t) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!com.facebook.FacebookSdk.isDebugEnabled() || isNullOrEmpty(tag)) {
            return;
        }
        android.util.Log.d(tag, msg, t);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> boolean areObjectsEqual(T a2, T b) {
        if (a2 == null) {
            return b == null;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(a2, b);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String safeGetStringFromResponse(org.json.JSONObject response, java.lang.String propertyName) {
        if (response != null) {
            java.lang.String optString = response.optString(propertyName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "response.optString(propertyName, \"\")");
            return optString;
        }
        return "";
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject tryGetJSONObjectFromResponse(org.json.JSONObject response, java.lang.String propertyKey) {
        if (response == null) {
            return null;
        }
        return response.optJSONObject(propertyKey);
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONArray tryGetJSONArrayFromResponse(org.json.JSONObject response, java.lang.String propertyKey) {
        if (response == null) {
            return null;
        }
        return response.optJSONArray(propertyKey);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> jsonArrayToStringList(org.json.JSONArray jsonArray) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(jsonArray.getString(i));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<java.lang.String> jsonArrayToSet(org.json.JSONArray jsonArray) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        java.util.HashSet hashSet = new java.util.HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                java.lang.String string = jsonArray.getString(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashSet;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String mapToJsonStr(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        java.lang.String str = "";
        if (!map.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (org.json.JSONException unused) {
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.String> jsonStrToMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new java.util.HashMap();
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String key = keys.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                java.lang.String string = jSONObject.getString(key);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (org.json.JSONException unused) {
            return new java.util.HashMap();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setAppEventAttributionParameters(org.json.JSONObject params, com.facebook.internal.AttributionIdentifiers attributionIdentifiers, java.lang.String anonymousAppDeviceGUID, boolean limitEventUsage, android.content.Context context) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
        if (!com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.ServiceUpdateCompliance)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        }
        params.put("application_tracking_enabled", !limitEventUsage);
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        params.put("advertiser_id_collection_enabled", com.facebook.FacebookSdk.getAdvertiserIDCollectionEnabled());
        if (attributionIdentifiers != null) {
            com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
            if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.ServiceUpdateCompliance)) {
                INSTANCE.appendAnonIdUnderCompliance(params, attributionIdentifiers, anonymousAppDeviceGUID, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                com.facebook.internal.FeatureManager featureManager3 = com.facebook.internal.FeatureManager.INSTANCE;
                if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.ServiceUpdateCompliance)) {
                    INSTANCE.appendAttributionIdUnderCompliance(params, attributionIdentifiers, context);
                } else {
                    params.put(com.ironsource.Y3.c, attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.getAndroidAdvertiserId() != null) {
                params.put("advertiser_id", attributionIdentifiers.getAndroidAdvertiserId());
                params.put("advertiser_tracking_enabled", !attributionIdentifiers.getIsTrackingLimited());
            }
            if (!attributionIdentifiers.getIsTrackingLimited()) {
                com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
                java.lang.String allHashedUserData = com.facebook.appevents.UserDataStore.getAllHashedUserData();
                if (allHashedUserData.length() != 0) {
                    params.put("ud", allHashedUserData);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                params.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAppVersion() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            android.content.pm.PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setAppEventExtendedDeviceInfoParameters(org.json.JSONObject params, android.content.Context appContext) throws org.json.JSONException {
        java.util.Locale locale2;
        java.lang.String language;
        int i;
        android.view.Display display;
        java.lang.String country;
        android.content.pm.PackageInfo packageInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        com.facebook.internal.Utility utility = INSTANCE;
        jSONArray.put(EXTRA_APP_EVENTS_INFO_FORMAT_VERSION);
        utility.refreshPeriodicExtendedDeviceInfo(appContext);
        java.lang.String packageName = appContext.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i3 = packageInfo.versionCode;
        versionName = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(versionName);
        jSONArray.put(android.os.Build.VERSION.RELEASE);
        jSONArray.put(android.os.Build.MODEL);
        try {
            locale2 = appContext.getResources().getConfiguration().locale;
        } catch (java.lang.Exception unused2) {
            locale2 = java.util.Locale.getDefault();
        }
        locale = locale2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Locale locale3 = locale;
        java.lang.String str = "";
        if (locale3 == null || (language = locale3.getLanguage()) == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        java.util.Locale locale4 = locale;
        if (locale4 != null && (country = locale4.getCountry()) != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d = 0.0d;
        try {
            java.lang.Object systemService = appContext.getSystemService("display");
            display = null;
            android.hardware.display.DisplayManager displayManager = systemService instanceof android.hardware.display.DisplayManager ? (android.hardware.display.DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (java.lang.Exception unused3) {
        }
        if (display != null) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            try {
                int i5 = displayMetrics.heightPixels;
                try {
                    d = displayMetrics.density;
                } catch (java.lang.Exception unused4) {
                }
                i = i5;
                i2 = i4;
            } catch (java.lang.Exception unused5) {
                i2 = i4;
            }
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(new java.text.DecimalFormat("#.##").format(d));
            jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
            jSONArray.put(totalExternalStorageGB);
            jSONArray.put(availableExternalStorageGB);
            jSONArray.put(deviceTimeZoneName);
            params.put(com.facebook.appevents.codeless.internal.Constants.EXTINFO, jSONArray.toString());
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new java.text.DecimalFormat("#.##").format(d));
        jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        params.put(com.facebook.appevents.codeless.internal.Constants.EXTINFO, jSONArray.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.reflect.Method getMethodQuietly(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.Class<?>... parameterTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (java.lang.Class[]) java.util.Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.reflect.Method getMethodQuietly(java.lang.String className, java.lang.String methodName, java.lang.Class<?>... parameterTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            java.lang.Class<?> clazz = java.lang.Class.forName(className);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return getMethodQuietly(clazz, methodName, (java.lang.Class<?>[]) java.util.Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Object invokeMethodQuietly(java.lang.Object receiver, java.lang.reflect.Method method, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(receiver, java.util.Arrays.copyOf(args, args.length));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getActivityName(android.content.Context context) {
        if (context == null) {
            return kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        java.lang.String simpleName = context.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUriString(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isWebUri(android.net.Uri uri) {
        return uri != null && (kotlin.text.StringsKt.equals(androidx.webkit.ProxyConfig.MATCH_HTTP, uri.getScheme(), true) || kotlin.text.StringsKt.equals("https", uri.getScheme(), true) || kotlin.text.StringsKt.equals("fbstaging", uri.getScheme(), true));
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isContentUri(android.net.Uri uri) {
        return uri != null && kotlin.text.StringsKt.equals("content", uri.getScheme(), true);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isFileUri(android.net.Uri uri) {
        return uri != null && kotlin.text.StringsKt.equals("file", uri.getScheme(), true);
    }

    @kotlin.jvm.JvmStatic
    public static final long getContentSize(android.net.Uri contentUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        android.database.Cursor cursor = null;
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            cursor = com.facebook.FacebookSdk.getApplicationContext().getContentResolver().query(contentUri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            return j;
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Date getBundleLongAsDate(android.os.Bundle bundle, java.lang.String key, java.util.Date dateBase) {
        long parseLong;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        java.lang.Object obj = bundle.get(key);
        if (obj instanceof java.lang.Long) {
            parseLong = ((java.lang.Number) obj).longValue();
        } else {
            if (obj instanceof java.lang.String) {
                try {
                    parseLong = java.lang.Long.parseLong((java.lang.String) obj);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new java.util.Date(Long.MAX_VALUE);
        }
        return new java.util.Date(dateBase.getTime() + (parseLong * 1000));
    }

    @kotlin.jvm.JvmStatic
    public static final void writeStringMapToParcel(android.os.Parcel parcel, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.String> readStringMapFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (readInt > 0) {
            int i = 0;
            do {
                i++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i < readInt);
        }
        return hashMap;
    }

    @kotlin.jvm.JvmStatic
    public static final void writeNonnullStringMapToParcel(android.os.Parcel parcel, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.String> readNonnullStringMapFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (readInt > 0) {
            int i = 0;
            do {
                i++;
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i < readInt);
        }
        return hashMap;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isCurrentAccessToken(com.facebook.AccessToken token) {
        return token != null && kotlin.jvm.internal.Intrinsics.areEqual(token, com.facebook.AccessToken.INSTANCE.getCurrentAccessToken());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGraphDomainFromTokenDomain(java.lang.String tokenGraphDomain) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String facebookDomain = com.facebook.FacebookSdk.getFacebookDomain();
        return tokenGraphDomain == null ? facebookDomain : kotlin.jvm.internal.Intrinsics.areEqual(tokenGraphDomain, com.facebook.FacebookSdk.GAMING) ? kotlin.text.StringsKt.replace$default(facebookDomain, com.facebook.FacebookSdk.FACEBOOK_COM, com.facebook.FacebookSdk.FB_GG, false, 4, (java.lang.Object) null) : kotlin.jvm.internal.Intrinsics.areEqual(tokenGraphDomain, com.facebook.FacebookSdk.INSTAGRAM) ? kotlin.text.StringsKt.replace$default(facebookDomain, com.facebook.FacebookSdk.FACEBOOK_COM, com.facebook.FacebookSdk.INSTAGRAM_COM, false, 4, (java.lang.Object) null) : facebookDomain;
    }

    @kotlin.jvm.JvmStatic
    public static final void getGraphMeRequestWithCacheAsync(final java.lang.String accessToken, final com.facebook.internal.Utility.GraphMeRequestWithCacheCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.facebook.internal.ProfileInformationCache profileInformationCache = com.facebook.internal.ProfileInformationCache.INSTANCE;
        org.json.JSONObject profileInformation = com.facebook.internal.ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            callback.onSuccess(profileInformation);
            return;
        }
        com.facebook.GraphRequest.Callback callback2 = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.internal.Utility$$ExternalSyntheticLambda0
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.internal.Utility.m5196getGraphMeRequestWithCacheAsync$lambda3(com.facebook.internal.Utility.GraphMeRequestWithCacheCallback.this, accessToken, graphResponse);
            }
        };
        com.facebook.GraphRequest graphMeRequestWithCache = INSTANCE.getGraphMeRequestWithCache(accessToken);
        graphMeRequestWithCache.setCallback(callback2);
        graphMeRequestWithCache.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getGraphMeRequestWithCacheAsync$lambda-3, reason: not valid java name */
    public static final void m5196getGraphMeRequestWithCacheAsync$lambda3(com.facebook.internal.Utility.GraphMeRequestWithCacheCallback callback, java.lang.String accessToken, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (response.getError() != null) {
            callback.onFailure(response.getError().getException());
            return;
        }
        com.facebook.internal.ProfileInformationCache profileInformationCache = com.facebook.internal.ProfileInformationCache.INSTANCE;
        org.json.JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        com.facebook.internal.ProfileInformationCache.putProfileInformation(accessToken, jsonObject);
        callback.onSuccess(response.getJsonObject());
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject awaitGetGraphMeRequestWithCache(java.lang.String accessToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        com.facebook.internal.ProfileInformationCache profileInformationCache = com.facebook.internal.ProfileInformationCache.INSTANCE;
        org.json.JSONObject profileInformation = com.facebook.internal.ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            return profileInformation;
        }
        com.facebook.GraphResponse executeAndWait = INSTANCE.getGraphMeRequestWithCache(accessToken).executeAndWait();
        if (executeAndWait.getError() != null) {
            return null;
        }
        return executeAndWait.getJsonObject();
    }

    private final com.facebook.GraphRequest getGraphMeRequestWithCache(java.lang.String accessToken) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.GraphRequest.FIELDS_PARAM, getProfileFieldsForGraphDomain(getCurrentTokenDomainWithDefault()));
        bundle.putString("access_token", accessToken);
        com.facebook.GraphRequest newMeRequest = com.facebook.GraphRequest.INSTANCE.newMeRequest(null, null);
        newMeRequest.setParameters(bundle);
        newMeRequest.setHttpMethod(com.facebook.HttpMethod.GET);
        return newMeRequest;
    }

    private final java.lang.String getProfileFieldsForGraphDomain(java.lang.String graphDomain) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(graphDomain, com.facebook.FacebookSdk.INSTAGRAM)) {
            return INSTAGRAM_PROFILE_FIELDS;
        }
        return FACEBOOK_PROFILE_FIELDS;
    }

    private final java.lang.String getCurrentTokenDomainWithDefault() {
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
        if (currentAccessToken != null && currentAccessToken.getGraphDomain() != null) {
            return currentAccessToken.getGraphDomain();
        }
        return com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN;
    }

    private final int refreshBestGuessNumberOfCPUCores() {
        int i = numCPUCores;
        if (i > 0) {
            return i;
        }
        try {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(new java.io.FilenameFilter() { // from class: com.facebook.internal.Utility$$ExternalSyntheticLambda1
                @Override // java.io.FilenameFilter
                public final boolean accept(java.io.File file, java.lang.String str) {
                    boolean m5197refreshBestGuessNumberOfCPUCores$lambda4;
                    m5197refreshBestGuessNumberOfCPUCores$lambda4 = com.facebook.internal.Utility.m5197refreshBestGuessNumberOfCPUCores$lambda4(file, str);
                    return m5197refreshBestGuessNumberOfCPUCores$lambda4;
                }
            });
            if (listFiles != null) {
                numCPUCores = listFiles.length;
            }
        } catch (java.lang.Exception unused) {
        }
        if (numCPUCores <= 0) {
            numCPUCores = java.lang.Math.max(java.lang.Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshBestGuessNumberOfCPUCores$lambda-4, reason: not valid java name */
    public static final boolean m5197refreshBestGuessNumberOfCPUCores$lambda4(java.io.File file, java.lang.String str) {
        return java.util.regex.Pattern.matches("cpu[0-9]+", str);
    }

    private final void refreshPeriodicExtendedDeviceInfo(android.content.Context appContext) {
        if (timestampOfLastCheck == -1 || java.lang.System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = java.lang.System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(appContext);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private final void refreshTimezone() {
        try {
            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
            java.lang.String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new java.util.Date()), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            deviceTimezoneAbbreviation = displayName;
            java.lang.String id = timeZone.getID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            deviceTimeZoneName = id;
        } catch (java.lang.AssertionError | java.lang.Exception unused) {
        }
    }

    private final void refreshCarrierName(android.content.Context appContext) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(carrierName, NO_CARRIER)) {
            try {
                java.lang.Object systemService = appContext.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
                if (systemService == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                java.lang.String networkOperatorName = ((android.telephony.TelephonyManager) systemService).getNetworkOperatorName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                carrierName = networkOperatorName;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private final boolean externalStorageExists() {
        return kotlin.jvm.internal.Intrinsics.areEqual("mounted", android.os.Environment.getExternalStorageState());
    }

    private final void refreshAvailableExternalStorage() {
        try {
            if (externalStorageExists()) {
                android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
        } catch (java.lang.Exception unused) {
        }
    }

    private final void refreshTotalExternalStorage() {
        try {
            if (externalStorageExists()) {
                android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = statFs.getBlockCount() * statFs.getBlockSize();
            }
            totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
        } catch (java.lang.Exception unused) {
        }
    }

    private final long convertBytesToGB(double bytes) {
        return java.lang.Math.round(bytes / 1.073741824E9d);
    }

    private final void appendAnonIdUnderCompliance(org.json.JSONObject params, com.facebook.internal.AttributionIdentifiers attributionIdentifiers, java.lang.String anonymousAppDeviceGUID, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 31 && isGooglePlayServicesAvailable(context)) {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("anon_id", anonymousAppDeviceGUID);
            return;
        }
        params.put("anon_id", anonymousAppDeviceGUID);
    }

    private final void appendAttributionIdUnderCompliance(org.json.JSONObject params, com.facebook.internal.AttributionIdentifiers attributionIdentifiers, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 31 && isGooglePlayServicesAvailable(context)) {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put(com.ironsource.Y3.c, attributionIdentifiers.getAttributionId());
            return;
        }
        params.put(com.ironsource.Y3.c, attributionIdentifiers.getAttributionId());
    }

    private final boolean isGooglePlayServicesAvailable(android.content.Context context) {
        java.lang.reflect.Method methodQuietly = getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (java.lang.Class<?>[]) new java.lang.Class[]{android.content.Context.class});
        if (methodQuietly == null) {
            return false;
        }
        java.lang.Object invokeMethodQuietly = invokeMethodQuietly(null, methodQuietly, context);
        return (invokeMethodQuietly instanceof java.lang.Integer) && kotlin.jvm.internal.Intrinsics.areEqual(invokeMethodQuietly, (java.lang.Object) 0);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String generateRandomString(int length) {
        java.lang.String bigInteger = new java.math.BigInteger(length * 5, new java.util.Random()).toString(32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean mustFixWindowParamsForAutofill(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return isAutofillAvailable(context);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAutofillAvailable(android.content.Context context) {
        android.view.autofill.AutofillManager autofillManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return android.os.Build.VERSION.SDK_INT >= 26 && (autofillManager = (android.view.autofill.AutofillManager) context.getSystemService(android.view.autofill.AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isChromeOS(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        if (android.os.Build.DEVICE != null) {
            java.lang.String DEVICE = android.os.Build.DEVICE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (new kotlin.text.Regex(ARC_DEVICE_PATTERN).matches(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Locale getResourceLocale() {
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            return com.facebook.FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Locale getCurrentLocale() {
        java.util.Locale resourceLocale = getResourceLocale();
        if (resourceLocale != null) {
            return resourceLocale;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        return locale2;
    }

    @kotlin.jvm.JvmStatic
    public static final void runOnNonUiThread(java.lang.Runnable runnable) {
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(runnable);
        } catch (java.lang.Exception unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAppName(android.content.Context context) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String applicationName = com.facebook.FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            }
            return string;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static final boolean isAutoAppLinkSetup() {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String format = java.lang.String.format("fb%s://applinks", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getApplicationId()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(android.net.Uri.parse(format));
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            java.lang.String packageName = applicationContext.getPackageName();
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject getDataProcessingOptions() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.Utility.class)) {
            return null;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String string = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(com.facebook.FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(com.facebook.FacebookSdk.DATA_PROCESSION_OPTIONS, null);
            if (string != null) {
                try {
                    return new org.json.JSONObject(string);
                } catch (org.json.JSONException unused) {
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.Utility.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isDataProcessingRestricted() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.Utility.class)) {
            return false;
        }
        try {
            org.json.JSONObject dataProcessingOptions = getDataProcessingOptions();
            if (dataProcessingOptions == null) {
                return false;
            }
            try {
                org.json.JSONArray jSONArray = dataProcessingOptions.getJSONArray(com.facebook.FacebookSdk.DATA_PROCESSION_OPTIONS);
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        java.lang.String string = jSONArray.getString(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        java.lang.String lowerCase = string.toLowerCase();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.Utility.class);
            return false;
        }
    }
}
