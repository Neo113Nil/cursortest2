package com.facebook.internal;

/* compiled from: NativeProtocol.kt */
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000eÕ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0084\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~0}H\u0002J\u000f\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0~H\u0002J\u000f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0~H\u0002J\u0013\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u007fH\u0002J.\u0010\u008a\u0001\u001a\u00020A2\u0010\u0010\u008b\u0001\u001a\u000b\u0012\u0004\u0012\u00020A\u0018\u00010\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020A2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0007J\u0018\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0007J\u0093\u0001\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u00042\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010\u009f\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\u00042\u0007\u0010¢\u0001\u001a\u00020\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010¤\u0001\u001a\u00030\u009d\u00012\b\u0010¥\u0001\u001a\u00030\u009d\u00012\b\u0010¦\u0001\u001a\u00030\u009d\u0001H\u0007J½\u0001\u0010§\u0001\u001a\u0005\u0018\u00010\u0095\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u007f2\u0007\u0010\u0098\u0001\u001a\u00020\u00042\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010\u009f\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\u00042\u0007\u0010¢\u0001\u001a\u00020\u00042\b\u0010¨\u0001\u001a\u00030\u009d\u00012\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010¤\u0001\u001a\u00030\u009d\u00012\b\u0010©\u0001\u001a\u00030ª\u00012\b\u0010¥\u0001\u001a\u00030\u009d\u00012\b\u0010¦\u0001\u001a\u00030\u009d\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0004H\u0002JD\u0010®\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010°\u0001\u001a\u0004\u0018\u00010\u00042\n\u0010±\u0001\u001a\u0005\u0018\u00010²\u00012\n\u0010³\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0007J\u0016\u0010´\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0007J.\u0010µ\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010¶\u0001\u001a\u00030\u0095\u00012\n\u0010·\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010¸\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0007JÆ\u0001\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010~2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u00042\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00042\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010\u009f\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\u00042\u0007\u0010¢\u0001\u001a\u00020\u00042\b\u0010¨\u0001\u001a\u00030\u009d\u00012\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010¤\u0001\u001a\u00030\u009d\u00012\b\u0010¥\u0001\u001a\u00030\u009d\u00012\b\u0010¦\u0001\u001a\u00030\u009d\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0002\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0019\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020A0\u008c\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u007fH\u0002J\u0016\u0010»\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010¼\u0001\u001a\u00030\u0095\u0001H\u0007J\u0018\u0010½\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0007J\u0016\u0010¿\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010À\u0001\u001a\u00030\u0095\u0001H\u0007J\u0018\u0010Á\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010Â\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0007J\u001d\u0010Ã\u0001\u001a\u00030²\u00012\u0007\u0010°\u0001\u001a\u00020\u00042\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0007J%\u0010Ä\u0001\u001a\u00030²\u00012\u000f\u0010Å\u0001\u001a\n\u0012\u0004\u0012\u00020\u007f\u0018\u00010~2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0002J\u0012\u0010Æ\u0001\u001a\u00020A2\u0007\u0010Ç\u0001\u001a\u00020AH\u0007J\t\u0010È\u0001\u001a\u00020AH\u0007J\u0016\u0010É\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010¼\u0001\u001a\u00030\u0095\u0001H\u0007J\u0013\u0010Ê\u0001\u001a\u00020A2\b\u0010¼\u0001\u001a\u00030\u0095\u0001H\u0007J\u0016\u0010Ë\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010À\u0001\u001a\u00030\u0095\u0001H\u0007J\u0014\u0010Ì\u0001\u001a\u00030\u009d\u00012\b\u0010À\u0001\u001a\u00030\u0095\u0001H\u0007J\u0013\u0010Í\u0001\u001a\u00030\u009d\u00012\u0007\u0010Î\u0001\u001a\u00020AH\u0007J?\u0010Ï\u0001\u001a\u00030Ð\u00012\b\u0010¼\u0001\u001a\u00030\u0095\u00012\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010°\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010Î\u0001\u001a\u00020A2\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0007J\n\u0010Ò\u0001\u001a\u00030Ð\u0001H\u0007J-\u0010Ó\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u007fH\u0007J-\u0010Ô\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u007fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0082\u0004¢\u0006\u0004\n\u0002\u0010BR\u000e\u0010C\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020AX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010v\u001a\n w*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R \u0010|\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~0}X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0~X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0~X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0082\u0001\u001a\u00030\u0083\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ü\u0001"}, d2 = {"Lcom/facebook/internal/NativeProtocol;", "", "()V", "ACTION_APPINVITE_DIALOG", "", "ACTION_CAMERA_EFFECT", "ACTION_FEED_DIALOG", "ACTION_LIKE_DIALOG", "ACTION_MESSAGE_DIALOG", "ACTION_OGACTIONPUBLISH_DIALOG", "ACTION_OGMESSAGEPUBLISH_DIALOG", "ACTION_SHARE_STORY", "AUDIENCE_EVERYONE", "AUDIENCE_FRIENDS", "AUDIENCE_ME", "BRIDGE_ARG_ACTION_ID_STRING", "BRIDGE_ARG_APP_NAME_STRING", "BRIDGE_ARG_ERROR_BUNDLE", "BRIDGE_ARG_ERROR_CODE", "BRIDGE_ARG_ERROR_DESCRIPTION", "BRIDGE_ARG_ERROR_JSON", "BRIDGE_ARG_ERROR_SUBCODE", "BRIDGE_ARG_ERROR_TYPE", "CONTENT_SCHEME", "ERROR_APPLICATION_ERROR", "ERROR_NETWORK_ERROR", "ERROR_PERMISSION_DENIED", "ERROR_PROTOCOL_ERROR", "ERROR_SERVICE_DISABLED", "ERROR_UNKNOWN_ERROR", "ERROR_USER_CANCELED", "EXTRA_ACCESS_TOKEN", "EXTRA_APPLICATION_ID", "EXTRA_APPLICATION_NAME", "EXTRA_AUTHENTICATION_TOKEN", "EXTRA_DATA_ACCESS_EXPIRATION_TIME", "EXTRA_DIALOG_COMPLETE_KEY", "EXTRA_DIALOG_COMPLETION_GESTURE_KEY", "EXTRA_EXPIRES_SECONDS_SINCE_EPOCH", "EXTRA_GET_INSTALL_DATA_PACKAGE", "EXTRA_GRAPH_API_VERSION", "EXTRA_LOGGER_REF", "EXTRA_NONCE", "EXTRA_PERMISSIONS", "EXTRA_PROTOCOL_ACTION", "EXTRA_PROTOCOL_BRIDGE_ARGS", "EXTRA_PROTOCOL_CALL_ID", "EXTRA_PROTOCOL_METHOD_ARGS", "EXTRA_PROTOCOL_METHOD_RESULTS", "EXTRA_PROTOCOL_VERSION", "EXTRA_PROTOCOL_VERSIONS", "EXTRA_TOAST_DURATION_MS", "EXTRA_USER_ID", "FACEBOOK_PROXY_AUTH_ACTIVITY", "FACEBOOK_PROXY_AUTH_APP_ID_KEY", "FACEBOOK_PROXY_AUTH_E2E_KEY", "FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY", "FACEBOOK_SDK_VERSION_KEY", "FACEBOOK_TOKEN_REFRESH_ACTIVITY", "IMAGE_URL_KEY", "IMAGE_USER_GENERATED_KEY", "INTENT_ACTION_PLATFORM_ACTIVITY", "INTENT_ACTION_PLATFORM_SERVICE", "KNOWN_PROTOCOL_VERSIONS", "", "", "[Ljava/lang/Integer;", "MESSAGE_GET_ACCESS_TOKEN_REPLY", "MESSAGE_GET_ACCESS_TOKEN_REQUEST", "MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY", "MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST", "MESSAGE_GET_INSTALL_DATA_REPLY", "MESSAGE_GET_INSTALL_DATA_REQUEST", "MESSAGE_GET_LIKE_STATUS_REPLY", "MESSAGE_GET_LIKE_STATUS_REQUEST", "MESSAGE_GET_LOGIN_STATUS_REPLY", "MESSAGE_GET_LOGIN_STATUS_REQUEST", "MESSAGE_GET_PROTOCOL_VERSIONS_REPLY", "MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST", "NO_PROTOCOL_AVAILABLE", "OPEN_GRAPH_CREATE_OBJECT_KEY", "PLATFORM_PROVIDER", "PLATFORM_PROVIDER_VERSIONS", "PLATFORM_PROVIDER_VERSION_COLUMN", "PROTOCOL_VERSION_20121101", "PROTOCOL_VERSION_20130502", "PROTOCOL_VERSION_20130618", "PROTOCOL_VERSION_20131024", "PROTOCOL_VERSION_20131107", "PROTOCOL_VERSION_20140204", "PROTOCOL_VERSION_20140313", "PROTOCOL_VERSION_20140324", "PROTOCOL_VERSION_20140701", "PROTOCOL_VERSION_20141001", "PROTOCOL_VERSION_20141028", "PROTOCOL_VERSION_20141107", "PROTOCOL_VERSION_20141218", "PROTOCOL_VERSION_20150401", "PROTOCOL_VERSION_20150702", "PROTOCOL_VERSION_20160327", "PROTOCOL_VERSION_20161017", "PROTOCOL_VERSION_20170213", "PROTOCOL_VERSION_20170411", "PROTOCOL_VERSION_20170417", "PROTOCOL_VERSION_20171115", "PROTOCOL_VERSION_20210906", "RESULT_ARGS_ACCESS_TOKEN", "RESULT_ARGS_DIALOG_COMPLETE_KEY", "RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY", "RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH", "RESULT_ARGS_GRAPH_DOMAIN", "RESULT_ARGS_PERMISSIONS", "RESULT_ARGS_SIGNED_REQUEST", "STATUS_ERROR_CODE", "STATUS_ERROR_DESCRIPTION", "STATUS_ERROR_JSON", "STATUS_ERROR_SUBCODE", "STATUS_ERROR_TYPE", "TAG", "kotlin.jvm.PlatformType", "WEB_DIALOG_ACTION", "WEB_DIALOG_IS_FALLBACK", "WEB_DIALOG_PARAMS", "WEB_DIALOG_URL", "actionToAppInfoMap", "", "", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "effectCameraAppInfoList", "facebookAppInfoList", "protocolVersionsAsyncUpdating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "buildActionToAppInfoMap", "buildEffectCameraAppInfoList", "buildFacebookAppList", "buildPlatformProviderVersionURI", "Landroid/net/Uri;", "appInfo", "computeLatestAvailableVersionFromVersionSpec", "allAvailableFacebookAppVersions", "Ljava/util/TreeSet;", "latestSdkVersion", "versionSpec", "", "createBundleForException", "Landroid/os/Bundle;", "e", "Lcom/facebook/FacebookException;", "createInstagramIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "applicationId", "permissions", "", "e2e", "isRerequest", "", "isForPublish", "defaultAudience", "Lcom/facebook/login/DefaultAudience;", "clientState", "authType", "messengerPageId", "resetMessengerState", "isFamilyLogin", "shouldSkipAccountDedupe", "createNativeAppIntent", "ignoreAppSwitchToLoggedOut", "targetApp", "Lcom/facebook/login/LoginTargetApp;", "nonce", "codeChallenge", "codeChallengeMethod", "createPlatformActivityIntent", "callId", "action", "versionResult", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "extras", "createPlatformServiceIntent", "createProtocolResultIntent", "requestIntent", "results", "error", "createProxyAuthIntents", "fetchAllAvailableProtocolVersionsForAppInfo", "getBridgeArgumentsFromIntent", "intent", "getCallIdFromIntent", "Ljava/util/UUID;", "getErrorDataFromResultIntent", "resultIntent", "getExceptionFromErrorData", "errorData", "getLatestAvailableProtocolVersionForAction", "getLatestAvailableProtocolVersionForAppInfoList", "appInfoList", "getLatestAvailableProtocolVersionForService", "minimumVersion", "getLatestKnownVersion", "getMethodArgumentsFromIntent", "getProtocolVersionFromIntent", "getSuccessResultsFromIntent", "isErrorResult", "isVersionCompatibleWithBucketedIntent", "version", "setupProtocolRequestIntent", "", "params", "updateAllAvailableProtocolVersionsAsync", "validateActivityIntent", "validateServiceIntent", "EffectTestAppInfo", "InstagramAppInfo", "KatanaAppInfo", "MessengerAppInfo", "NativeAppInfo", "ProtocolVersionQueryResult", "WakizashiAppInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeProtocol {
    public static final java.lang.String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";
    public static final java.lang.String ACTION_CAMERA_EFFECT = "com.facebook.platform.action.request.CAMERA_EFFECT";
    public static final java.lang.String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";
    public static final java.lang.String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";
    public static final java.lang.String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";
    public static final java.lang.String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    public static final java.lang.String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    public static final java.lang.String ACTION_SHARE_STORY = "com.facebook.platform.action.request.SHARE_STORY";
    public static final java.lang.String AUDIENCE_EVERYONE = "everyone";
    public static final java.lang.String AUDIENCE_FRIENDS = "friends";
    public static final java.lang.String AUDIENCE_ME = "only_me";
    public static final java.lang.String BRIDGE_ARG_ACTION_ID_STRING = "action_id";
    public static final java.lang.String BRIDGE_ARG_APP_NAME_STRING = "app_name";
    public static final java.lang.String BRIDGE_ARG_ERROR_BUNDLE = "error";
    public static final java.lang.String BRIDGE_ARG_ERROR_CODE = "error_code";
    public static final java.lang.String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";
    public static final java.lang.String BRIDGE_ARG_ERROR_JSON = "error_json";
    public static final java.lang.String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";
    public static final java.lang.String BRIDGE_ARG_ERROR_TYPE = "error_type";
    private static final java.lang.String CONTENT_SCHEME = "content://";
    public static final java.lang.String ERROR_APPLICATION_ERROR = "ApplicationError";
    public static final java.lang.String ERROR_NETWORK_ERROR = "NetworkError";
    public static final java.lang.String ERROR_PERMISSION_DENIED = "PermissionDenied";
    public static final java.lang.String ERROR_PROTOCOL_ERROR = "ProtocolError";
    public static final java.lang.String ERROR_SERVICE_DISABLED = "ServiceDisabled";
    public static final java.lang.String ERROR_UNKNOWN_ERROR = "UnknownError";
    public static final java.lang.String ERROR_USER_CANCELED = "UserCanceled";
    public static final java.lang.String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";
    public static final java.lang.String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";
    public static final java.lang.String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";
    public static final java.lang.String EXTRA_AUTHENTICATION_TOKEN = "com.facebook.platform.extra.ID_TOKEN";
    public static final java.lang.String EXTRA_DATA_ACCESS_EXPIRATION_TIME = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";
    public static final java.lang.String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
    public static final java.lang.String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
    public static final java.lang.String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";
    public static final java.lang.String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
    public static final java.lang.String EXTRA_GRAPH_API_VERSION = "com.facebook.platform.extra.GRAPH_API_VERSION";
    public static final java.lang.String EXTRA_LOGGER_REF = "com.facebook.platform.extra.LOGGER_REF";
    public static final java.lang.String EXTRA_NONCE = "com.facebook.platform.extra.NONCE";
    public static final java.lang.String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";
    public static final java.lang.String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";
    public static final java.lang.String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";
    public static final java.lang.String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";
    public static final java.lang.String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";
    public static final java.lang.String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";
    public static final java.lang.String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";
    public static final java.lang.String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
    public static final java.lang.String EXTRA_TOAST_DURATION_MS = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";
    public static final java.lang.String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";
    private static final java.lang.String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";
    public static final java.lang.String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";
    public static final java.lang.String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";
    public static final java.lang.String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";
    public static final java.lang.String FACEBOOK_SDK_VERSION_KEY = "facebook_sdk_version";
    private static final java.lang.String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";
    public static final java.lang.String IMAGE_URL_KEY = "url";
    public static final java.lang.String IMAGE_USER_GENERATED_KEY = "user_generated";
    public static final com.facebook.internal.NativeProtocol INSTANCE;
    public static final java.lang.String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";
    public static final java.lang.String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
    private static final java.lang.Integer[] KNOWN_PROTOCOL_VERSIONS;
    public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 65537;
    public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 65536;
    public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY = 65545;
    public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST = 65544;
    public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 65541;
    public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 65540;
    public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 65543;
    public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 65542;
    public static final int MESSAGE_GET_LOGIN_STATUS_REPLY = 65547;
    public static final int MESSAGE_GET_LOGIN_STATUS_REQUEST = 65546;
    public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 65539;
    public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 65538;
    public static final int NO_PROTOCOL_AVAILABLE = -1;
    public static final java.lang.String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
    private static final java.lang.String PLATFORM_PROVIDER = ".provider.PlatformProvider";
    private static final java.lang.String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";
    private static final java.lang.String PLATFORM_PROVIDER_VERSION_COLUMN = "version";
    public static final int PROTOCOL_VERSION_20121101 = 20121101;
    public static final int PROTOCOL_VERSION_20130502 = 20130502;
    public static final int PROTOCOL_VERSION_20130618 = 20130618;
    public static final int PROTOCOL_VERSION_20131024 = 20131024;
    public static final int PROTOCOL_VERSION_20131107 = 20131107;
    public static final int PROTOCOL_VERSION_20140204 = 20140204;
    public static final int PROTOCOL_VERSION_20140313 = 20140313;
    public static final int PROTOCOL_VERSION_20140324 = 20140324;
    public static final int PROTOCOL_VERSION_20140701 = 20140701;
    public static final int PROTOCOL_VERSION_20141001 = 20141001;
    public static final int PROTOCOL_VERSION_20141028 = 20141028;
    public static final int PROTOCOL_VERSION_20141107 = 20141107;
    public static final int PROTOCOL_VERSION_20141218 = 20141218;
    public static final int PROTOCOL_VERSION_20150401 = 20150401;
    public static final int PROTOCOL_VERSION_20150702 = 20150702;
    public static final int PROTOCOL_VERSION_20160327 = 20160327;
    public static final int PROTOCOL_VERSION_20161017 = 20161017;
    public static final int PROTOCOL_VERSION_20170213 = 20170213;
    public static final int PROTOCOL_VERSION_20170411 = 20170411;
    public static final int PROTOCOL_VERSION_20170417 = 20170417;
    public static final int PROTOCOL_VERSION_20171115 = 20171115;
    public static final int PROTOCOL_VERSION_20210906 = 20210906;
    public static final java.lang.String RESULT_ARGS_ACCESS_TOKEN = "access_token";
    public static final java.lang.String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
    public static final java.lang.String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
    public static final java.lang.String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";
    public static final java.lang.String RESULT_ARGS_GRAPH_DOMAIN = "graph_domain";
    public static final java.lang.String RESULT_ARGS_PERMISSIONS = "permissions";
    public static final java.lang.String RESULT_ARGS_SIGNED_REQUEST = "signed request";
    public static final java.lang.String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";
    public static final java.lang.String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";
    public static final java.lang.String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";
    public static final java.lang.String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";
    public static final java.lang.String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";
    private static final java.lang.String TAG;
    public static final java.lang.String WEB_DIALOG_ACTION = "action";
    public static final java.lang.String WEB_DIALOG_IS_FALLBACK = "is_fallback";
    public static final java.lang.String WEB_DIALOG_PARAMS = "params";
    public static final java.lang.String WEB_DIALOG_URL = "url";
    private static final java.util.Map<java.lang.String, java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo>> actionToAppInfoMap;
    private static final java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> effectCameraAppInfoList;
    private static final java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> facebookAppInfoList;
    private static final java.util.concurrent.atomic.AtomicBoolean protocolVersionsAsyncUpdating;

    private NativeProtocol() {
    }

    public static final /* synthetic */ java.util.TreeSet access$fetchAllAvailableProtocolVersionsForAppInfo(com.facebook.internal.NativeProtocol nativeProtocol, com.facebook.internal.NativeProtocol.NativeAppInfo nativeAppInfo) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            return nativeProtocol.fetchAllAvailableProtocolVersionsForAppInfo(nativeAppInfo);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$getTAG$p() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    static {
        com.facebook.internal.NativeProtocol nativeProtocol = new com.facebook.internal.NativeProtocol();
        INSTANCE = nativeProtocol;
        TAG = com.facebook.internal.NativeProtocol.class.getName();
        facebookAppInfoList = nativeProtocol.buildFacebookAppList();
        effectCameraAppInfoList = nativeProtocol.buildEffectCameraAppInfoList();
        actionToAppInfoMap = nativeProtocol.buildActionToAppInfoMap();
        protocolVersionsAsyncUpdating = new java.util.concurrent.atomic.AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new java.lang.Integer[]{java.lang.Integer.valueOf(PROTOCOL_VERSION_20210906), java.lang.Integer.valueOf(PROTOCOL_VERSION_20171115), java.lang.Integer.valueOf(PROTOCOL_VERSION_20170417), java.lang.Integer.valueOf(PROTOCOL_VERSION_20170411), java.lang.Integer.valueOf(PROTOCOL_VERSION_20170213), java.lang.Integer.valueOf(PROTOCOL_VERSION_20161017), java.lang.Integer.valueOf(PROTOCOL_VERSION_20160327), java.lang.Integer.valueOf(PROTOCOL_VERSION_20150702), java.lang.Integer.valueOf(PROTOCOL_VERSION_20150401), java.lang.Integer.valueOf(PROTOCOL_VERSION_20141218), java.lang.Integer.valueOf(PROTOCOL_VERSION_20141107), java.lang.Integer.valueOf(PROTOCOL_VERSION_20141028), java.lang.Integer.valueOf(PROTOCOL_VERSION_20141001), java.lang.Integer.valueOf(PROTOCOL_VERSION_20140701), java.lang.Integer.valueOf(PROTOCOL_VERSION_20140324), java.lang.Integer.valueOf(PROTOCOL_VERSION_20140313), java.lang.Integer.valueOf(PROTOCOL_VERSION_20140204), java.lang.Integer.valueOf(PROTOCOL_VERSION_20131107), java.lang.Integer.valueOf(PROTOCOL_VERSION_20131024), java.lang.Integer.valueOf(PROTOCOL_VERSION_20130618), java.lang.Integer.valueOf(PROTOCOL_VERSION_20130502), java.lang.Integer.valueOf(PROTOCOL_VERSION_20121101)};
    }

    private final java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> buildFacebookAppList() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return kotlin.collections.CollectionsKt.arrayListOf(new com.facebook.internal.NativeProtocol.KatanaAppInfo(), new com.facebook.internal.NativeProtocol.WakizashiAppInfo());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> buildEffectCameraAppInfoList() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList arrayListOf = kotlin.collections.CollectionsKt.arrayListOf(new com.facebook.internal.NativeProtocol.EffectTestAppInfo());
            arrayListOf.addAll(buildFacebookAppList());
            return arrayListOf;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.util.Map<java.lang.String, java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo>> buildActionToAppInfoMap() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.facebook.internal.NativeProtocol.MessengerAppInfo());
            java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> list = facebookAppInfoList;
            hashMap.put(ACTION_OGACTIONPUBLISH_DIALOG, list);
            hashMap.put(ACTION_FEED_DIALOG, list);
            hashMap.put(ACTION_LIKE_DIALOG, list);
            hashMap.put(ACTION_APPINVITE_DIALOG, list);
            hashMap.put(ACTION_MESSAGE_DIALOG, arrayList);
            hashMap.put(ACTION_OGMESSAGEPUBLISH_DIALOG, arrayList);
            hashMap.put(ACTION_CAMERA_EFFECT, effectCameraAppInfoList);
            hashMap.put(ACTION_SHARE_STORY, list);
            return hashMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent validateActivityIntent(android.content.Context context, android.content.Intent intent, com.facebook.internal.NativeProtocol.NativeAppInfo appInfo) {
        android.content.pm.ResolveInfo resolveActivity;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            com.facebook.internal.FacebookSignatureValidator facebookSignatureValidator = com.facebook.internal.FacebookSignatureValidator.INSTANCE;
            java.lang.String str = resolveActivity.activityInfo.packageName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
            if (com.facebook.internal.FacebookSignatureValidator.validateSignature(context, str)) {
                return intent;
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent validateServiceIntent(android.content.Context context, android.content.Intent intent, com.facebook.internal.NativeProtocol.NativeAppInfo appInfo) {
        android.content.pm.ResolveInfo resolveService;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            com.facebook.internal.FacebookSignatureValidator facebookSignatureValidator = com.facebook.internal.FacebookSignatureValidator.INSTANCE;
            java.lang.String str = resolveService.serviceInfo.packageName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (com.facebook.internal.FacebookSignatureValidator.validateSignature(context, str)) {
                return intent;
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent createInstagramIntent(android.content.Context context, java.lang.String applicationId, java.util.Collection<java.lang.String> permissions, java.lang.String e2e, boolean isRerequest, boolean isForPublish, com.facebook.login.DefaultAudience defaultAudience, java.lang.String clientState, java.lang.String authType, java.lang.String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e2e, "e2e");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientState, "clientState");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            com.facebook.internal.NativeProtocol.InstagramAppInfo instagramAppInfo = new com.facebook.internal.NativeProtocol.InstagramAppInfo();
            return validateActivityIntent(context, INSTANCE.createNativeAppIntent(instagramAppInfo, applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, com.facebook.login.LoginTargetApp.INSTAGRAM, isFamilyLogin, shouldSkipAccountDedupe, "", null, null), instagramAppInfo);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    private final android.content.Intent createNativeAppIntent(com.facebook.internal.NativeProtocol.NativeAppInfo appInfo, java.lang.String applicationId, java.util.Collection<java.lang.String> permissions, java.lang.String e2e, boolean isForPublish, com.facebook.login.DefaultAudience defaultAudience, java.lang.String clientState, java.lang.String authType, boolean ignoreAppSwitchToLoggedOut, java.lang.String messengerPageId, boolean resetMessengerState, com.facebook.login.LoginTargetApp targetApp, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, java.lang.String nonce, java.lang.String codeChallenge, java.lang.String codeChallengeMethod) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.lang.String loginActivity = appInfo.getLoginActivity();
            if (loginActivity == null) {
                return null;
            }
            android.content.Intent putExtra = new android.content.Intent().setClassName(appInfo.getPackage(), loginActivity).putExtra("client_id", applicationId);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            putExtra.putExtra(FACEBOOK_SDK_VERSION_KEY, com.facebook.FacebookSdk.getSdkVersion());
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(permissions)) {
                putExtra.putExtra("scope", android.text.TextUtils.join(",", permissions));
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(e2e)) {
                putExtra.putExtra("e2e", e2e);
            }
            putExtra.putExtra("state", clientState);
            putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, appInfo.getResponseType());
            putExtra.putExtra("nonce", nonce);
            putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
            if (isForPublish) {
                putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_LEGACY_OVERRIDE, com.facebook.FacebookSdk.getGraphApiVersion());
            putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_AUTH_TYPE, authType);
            if (ignoreAppSwitchToLoggedOut) {
                putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_FAIL_ON_LOGGED_OUT, true);
            }
            putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, messengerPageId);
            putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, resetMessengerState);
            if (isFamilyLogin) {
                putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_FX_APP, targetApp.getTargetApp());
            }
            if (shouldSkipAccountDedupe) {
                putExtra.putExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, true);
            }
            return putExtra;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static /* synthetic */ java.util.List createProxyAuthIntents$default(android.content.Context context, java.lang.String str, java.util.Collection collection, java.lang.String str2, boolean z, boolean z2, com.facebook.login.DefaultAudience defaultAudience, java.lang.String str3, java.lang.String str4, boolean z3, java.lang.String str5, boolean z4, boolean z5, boolean z6, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            return createProxyAuthIntents(context, str, collection, str2, z, z2, defaultAudience, str3, str4, z3, str5, z4, z5, z6, str6, str7, (i & 65536) != 0 ? "S256" : str8);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<android.content.Intent> createProxyAuthIntents(android.content.Context context, java.lang.String applicationId, java.util.Collection<java.lang.String> permissions, java.lang.String e2e, boolean isRerequest, boolean isForPublish, com.facebook.login.DefaultAudience defaultAudience, java.lang.String clientState, java.lang.String authType, boolean ignoreAppSwitchToLoggedOut, java.lang.String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, java.lang.String nonce, java.lang.String codeChallenge, java.lang.String codeChallengeMethod) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e2e, "e2e");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientState, "clientState");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "authType");
            java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> list = facebookAppInfoList;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.ArrayList arrayList2 = arrayList;
                android.content.Intent createNativeAppIntent = INSTANCE.createNativeAppIntent((com.facebook.internal.NativeProtocol.NativeAppInfo) it.next(), applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, ignoreAppSwitchToLoggedOut, messengerPageId, resetMessengerState, com.facebook.login.LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDedupe, nonce, codeChallenge, codeChallengeMethod);
                if (createNativeAppIntent != null) {
                    arrayList2.add(createNativeAppIntent);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int getLatestKnownVersion() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return 0;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isVersionCompatibleWithBucketedIntent(int version) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return false;
        }
        try {
            return kotlin.collections.ArraysKt.contains(KNOWN_PROTOCOL_VERSIONS, java.lang.Integer.valueOf(version)) && version >= 20140701;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent createPlatformActivityIntent(android.content.Context context, java.lang.String callId, java.lang.String action, com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult versionResult, android.os.Bundle extras) {
        com.facebook.internal.NativeProtocol.NativeAppInfo appInfo;
        android.content.Intent validateActivityIntent;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (versionResult == null || (appInfo = versionResult.getAppInfo()) == null || (validateActivityIntent = validateActivityIntent(context, new android.content.Intent().setAction(INTENT_ACTION_PLATFORM_ACTIVITY).setPackage(appInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), appInfo)) == null) {
                return null;
            }
            setupProtocolRequestIntent(validateActivityIntent, callId, action, versionResult.getProtocolVersion(), extras);
            return validateActivityIntent;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setupProtocolRequestIntent(android.content.Intent intent, java.lang.String callId, java.lang.String action, int version, android.os.Bundle params) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String applicationName = com.facebook.FacebookSdk.getApplicationName();
            intent.putExtra(EXTRA_PROTOCOL_VERSION, version).putExtra(EXTRA_PROTOCOL_ACTION, action).putExtra(EXTRA_APPLICATION_ID, applicationId);
            if (isVersionCompatibleWithBucketedIntent(version)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("action_id", callId);
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.putNonEmptyString(bundle, BRIDGE_ARG_APP_NAME_STRING, applicationName);
                intent.putExtra(EXTRA_PROTOCOL_BRIDGE_ARGS, bundle);
                if (params == null) {
                    params = new android.os.Bundle();
                }
                intent.putExtra(EXTRA_PROTOCOL_METHOD_ARGS, params);
                return;
            }
            intent.putExtra(EXTRA_PROTOCOL_CALL_ID, callId);
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(applicationName)) {
                intent.putExtra(EXTRA_APPLICATION_NAME, applicationName);
            }
            if (params != null) {
                intent.putExtras(params);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent createProtocolResultIntent(android.content.Intent requestIntent, android.os.Bundle results, com.facebook.FacebookException error) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            java.util.UUID callIdFromIntent = getCallIdFromIntent(requestIntent);
            if (callIdFromIntent == null) {
                return null;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(EXTRA_PROTOCOL_VERSION, getProtocolVersionFromIntent(requestIntent));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("action_id", callIdFromIntent.toString());
            if (error != null) {
                bundle.putBundle("error", createBundleForException(error));
            }
            intent.putExtra(EXTRA_PROTOCOL_BRIDGE_ARGS, bundle);
            if (results != null) {
                intent.putExtra(EXTRA_PROTOCOL_METHOD_RESULTS, results);
            }
            return intent;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent createPlatformServiceIntent(android.content.Context context) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            for (com.facebook.internal.NativeProtocol.NativeAppInfo nativeAppInfo : facebookAppInfoList) {
                android.content.Intent validateServiceIntent = validateServiceIntent(context, new android.content.Intent(INTENT_ACTION_PLATFORM_SERVICE).setPackage(nativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), nativeAppInfo);
                if (validateServiceIntent != null) {
                    return validateServiceIntent;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int getProtocolVersionFromIntent(android.content.Intent intent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra(EXTRA_PROTOCOL_VERSION, 0);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return 0;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.UUID getCallIdFromIntent(android.content.Intent intent) {
        java.lang.String stringExtra;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class) || intent == null) {
            return null;
        }
        try {
            if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                android.os.Bundle bundleExtra = intent.getBundleExtra(EXTRA_PROTOCOL_BRIDGE_ARGS);
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra(EXTRA_PROTOCOL_CALL_ID);
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return java.util.UUID.fromString(stringExtra);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getBridgeArgumentsFromIntent(android.content.Intent intent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                return null;
            }
            return intent.getBundleExtra(EXTRA_PROTOCOL_BRIDGE_ARGS);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getMethodArgumentsFromIntent(android.content.Intent intent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra(EXTRA_PROTOCOL_METHOD_ARGS);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getSuccessResultsFromIntent(android.content.Intent resultIntent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            int protocolVersionFromIntent = getProtocolVersionFromIntent(resultIntent);
            android.os.Bundle extras = resultIntent.getExtras();
            if (isVersionCompatibleWithBucketedIntent(protocolVersionFromIntent) && extras != null) {
                return extras.getBundle(EXTRA_PROTOCOL_METHOD_RESULTS);
            }
            return extras;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isErrorResult(android.content.Intent resultIntent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            android.os.Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
            java.lang.Boolean valueOf = bridgeArgumentsFromIntent == null ? null : java.lang.Boolean.valueOf(bridgeArgumentsFromIntent.containsKey("error"));
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
            return resultIntent.hasExtra(STATUS_ERROR_TYPE);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getErrorDataFromResultIntent(android.content.Intent resultIntent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            if (!isErrorResult(resultIntent)) {
                return null;
            }
            android.os.Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
            if (bridgeArgumentsFromIntent != null) {
                return bridgeArgumentsFromIntent.getBundle("error");
            }
            return resultIntent.getExtras();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.FacebookException getExceptionFromErrorData(android.os.Bundle errorData) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class) || errorData == null) {
            return null;
        }
        try {
            java.lang.String string = errorData.getString(BRIDGE_ARG_ERROR_TYPE);
            if (string == null) {
                string = errorData.getString(STATUS_ERROR_TYPE);
            }
            java.lang.String string2 = errorData.getString(BRIDGE_ARG_ERROR_DESCRIPTION);
            if (string2 == null) {
                string2 = errorData.getString(STATUS_ERROR_DESCRIPTION);
            }
            if (string != null && kotlin.text.StringsKt.equals(string, ERROR_USER_CANCELED, true)) {
                return new com.facebook.FacebookOperationCanceledException(string2);
            }
            return new com.facebook.FacebookException(string2);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle createBundleForException(com.facebook.FacebookException e) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class) || e == null) {
            return null;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(BRIDGE_ARG_ERROR_DESCRIPTION, e.toString());
            if (e instanceof com.facebook.FacebookOperationCanceledException) {
                bundle.putString(BRIDGE_ARG_ERROR_TYPE, ERROR_USER_CANCELED);
            }
            return bundle;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int getLatestAvailableProtocolVersionForService(int minimumVersion) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return 0;
        }
        try {
            return INSTANCE.getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[]{minimumVersion}).getProtocolVersion();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return 0;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAction(java.lang.String action, int[] versionSpec) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            java.util.List<com.facebook.internal.NativeProtocol.NativeAppInfo> list = actionToAppInfoMap.get(action);
            if (list == null) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            return INSTANCE.getLatestAvailableProtocolVersionForAppInfoList(list, versionSpec);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return null;
        }
    }

    private final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(java.util.List<? extends com.facebook.internal.NativeProtocol.NativeAppInfo> appInfoList, int[] versionSpec) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            updateAllAvailableProtocolVersionsAsync();
            if (appInfoList == null) {
                return com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult.INSTANCE.createEmpty();
            }
            for (com.facebook.internal.NativeProtocol.NativeAppInfo nativeAppInfo : appInfoList) {
                int computeLatestAvailableVersionFromVersionSpec = computeLatestAvailableVersionFromVersionSpec(nativeAppInfo.getAvailableVersions(), getLatestKnownVersion(), versionSpec);
                if (computeLatestAvailableVersionFromVersionSpec != -1) {
                    return com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult.INSTANCE.create(nativeAppInfo, computeLatestAvailableVersionFromVersionSpec);
                }
            }
            return com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult.INSTANCE.createEmpty();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void updateAllAvailableProtocolVersionsAsync() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return;
        }
        try {
            if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.internal.NativeProtocol$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.internal.NativeProtocol.m5193updateAllAvailableProtocolVersionsAsync$lambda1();
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateAllAvailableProtocolVersionsAsync$lambda-1, reason: not valid java name */
    public static final void m5193updateAllAvailableProtocolVersionsAsync$lambda1() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return;
        }
        try {
            try {
                java.util.Iterator<com.facebook.internal.NativeProtocol.NativeAppInfo> it = facebookAppInfoList.iterator();
                while (it.hasNext()) {
                    it.next().fetchAvailableVersions(true);
                }
            } finally {
                protocolVersionsAsyncUpdating.set(false);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #6 {all -> 0x009b, blocks: (B:6:0x000d, B:29:0x009a, B:30:0x0097, B:17:0x008e), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[EXC_TOP_SPLITTER, LOOP:0: B:19:0x006f->B:22:0x0075, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.TreeSet<java.lang.Integer> fetchAllAvailableProtocolVersionsForAppInfo(com.facebook.internal.NativeProtocol.NativeAppInfo appInfo) {
        android.database.Cursor cursor;
        android.content.pm.ProviderInfo providerInfo;
        android.database.Cursor cursor2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.TreeSet<java.lang.Integer> treeSet = new java.util.TreeSet<>();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.ContentResolver contentResolver = com.facebook.FacebookSdk.getApplicationContext().getContentResolver();
            java.lang.String[] strArr = {"version"};
            android.net.Uri buildPlatformProviderVersionURI = buildPlatformProviderVersionURI(appInfo);
            try {
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                try {
                    providerInfo = com.facebook.FacebookSdk.getApplicationContext().getPackageManager().resolveContentProvider(kotlin.jvm.internal.Intrinsics.stringPlus(appInfo.getPackage(), PLATFORM_PROVIDER), 0);
                } catch (java.lang.RuntimeException e) {
                    android.util.Log.e(TAG, "Failed to query content resolver.", e);
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        try {
                            cursor2 = contentResolver.query(buildPlatformProviderVersionURI, strArr, null, null, null);
                        } catch (java.lang.SecurityException unused) {
                            android.util.Log.e(TAG, "Failed to query content resolver.");
                            cursor2 = null;
                            if (cursor2 != null) {
                            }
                            if (cursor2 != null) {
                            }
                            return treeSet;
                        }
                    } catch (java.lang.IllegalArgumentException unused2) {
                        android.util.Log.e(TAG, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (java.lang.NullPointerException unused3) {
                        android.util.Log.e(TAG, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(java.lang.Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (java.lang.Throwable th) {
                                cursor = cursor2;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int computeLatestAvailableVersionFromVersionSpec(java.util.TreeSet<java.lang.Integer> allAvailableFacebookAppVersions, int latestSdkVersion, int[] versionSpec) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.NativeProtocol.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (allAvailableFacebookAppVersions == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            java.util.Iterator<java.lang.Integer> descendingIterator = allAvailableFacebookAppVersions.descendingIterator();
            int i = -1;
            while (descendingIterator.hasNext()) {
                java.lang.Integer fbAppVersion = descendingIterator.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i = java.lang.Math.max(i, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 == 0) {
                        return java.lang.Math.min(i, latestSdkVersion);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.NativeProtocol.class);
            return 0;
        }
    }

    private final android.net.Uri buildPlatformProviderVersionURI(com.facebook.internal.NativeProtocol.NativeAppInfo appInfo) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "()V", "availableVersions", "Ljava/util/TreeSet;", "", "fetchAvailableVersions", "", "force", "", "getAvailableVersions", "getLoginActivity", "", "getPackage", "getResponseType", "onAvailableVersionsNullOrEmpty", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class NativeAppInfo {
        private java.util.TreeSet<java.lang.Integer> availableVersions;

        public abstract java.lang.String getLoginActivity();

        public abstract java.lang.String getPackage();

        public void onAvailableVersionsNullOrEmpty() {
        }

        public java.lang.String getResponseType() {
            return com.facebook.internal.ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty())), (java.lang.Object) false) == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.util.TreeSet<java.lang.Integer> getAvailableVersions() {
            java.util.TreeSet<java.lang.Integer> treeSet = this.availableVersions;
            if (treeSet != null) {
            }
            fetchAvailableVersions(false);
            return this.availableVersions;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x001c, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (r2 == null ? null : java.lang.Boolean.valueOf(r2.isEmpty())), (java.lang.Object) false) == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized void fetchAvailableVersions(boolean force) {
            if (!force) {
                java.util.TreeSet<java.lang.Integer> treeSet = this.availableVersions;
                if (treeSet != null) {
                }
            }
            this.availableVersions = com.facebook.internal.NativeProtocol.access$fetchAllAvailableProtocolVersionsForAppInfo(com.facebook.internal.NativeProtocol.INSTANCE, this);
            java.util.TreeSet<java.lang.Integer> treeSet2 = this.availableVersions;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                onAvailableVersionsNullOrEmpty();
            }
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/facebook/internal/NativeProtocol$KatanaAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "isAndroidAPIVersionNotLessThan30", "", "onAvailableVersionsNullOrEmpty", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class KatanaAppInfo extends com.facebook.internal.NativeProtocol.NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getLoginActivity() {
            return com.facebook.internal.NativeProtocol.FACEBOOK_PROXY_AUTH_ACTIVITY;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getPackage() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public void onAvailableVersionsNullOrEmpty() {
            if (isAndroidAPIVersionNotLessThan30()) {
                android.util.Log.w(com.facebook.internal.NativeProtocol.access$getTAG$p(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        private final boolean isAndroidAPIVersionNotLessThan30() {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            return com.facebook.FacebookSdk.getApplicationContext().getApplicationInfo().targetSdkVersion >= 30;
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class MessengerAppInfo extends com.facebook.internal.NativeProtocol.NativeAppInfo {
        /* renamed from: getLoginActivity, reason: collision with other method in class */
        public java.lang.Void m5195getLoginActivity() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ java.lang.String getLoginActivity() {
            return (java.lang.String) m5195getLoginActivity();
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getPackage() {
            return "com.facebook.orca";
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/NativeProtocol$WakizashiAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class WakizashiAppInfo extends com.facebook.internal.NativeProtocol.NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getLoginActivity() {
            return com.facebook.internal.NativeProtocol.FACEBOOK_PROXY_AUTH_ACTIVITY;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getPackage() {
            return "com.facebook.wakizashi";
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$InstagramAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "getResponseType", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class InstagramAppInfo extends com.facebook.internal.NativeProtocol.NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getLoginActivity() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getPackage() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getResponseType() {
            return com.facebook.internal.ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES;
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/NativeProtocol$EffectTestAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "()V", "getLoginActivity", "", "getPackage", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class EffectTestAppInfo extends com.facebook.internal.NativeProtocol.NativeAppInfo {
        /* renamed from: getLoginActivity, reason: collision with other method in class */
        public java.lang.Void m5194getLoginActivity() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ java.lang.String getLoginActivity() {
            return (java.lang.String) m5194getLoginActivity();
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public java.lang.String getPackage() {
            return "com.facebook.arstudio.player";
        }
    }

    /* compiled from: NativeProtocol.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "", "()V", "<set-?>", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "appInfo", "getAppInfo", "()Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "protocolVersion", "getProtocolVersion", "()I", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ProtocolVersionQueryResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult.Companion INSTANCE = new com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult.Companion(null);
        private com.facebook.internal.NativeProtocol.NativeAppInfo appInfo;
        private int protocolVersion;

        public /* synthetic */ ProtocolVersionQueryResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult create(com.facebook.internal.NativeProtocol.NativeAppInfo nativeAppInfo, int i) {
            return INSTANCE.create(nativeAppInfo, i);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult createEmpty() {
            return INSTANCE.createEmpty();
        }

        private ProtocolVersionQueryResult() {
        }

        public final com.facebook.internal.NativeProtocol.NativeAppInfo getAppInfo() {
            return this.appInfo;
        }

        public final int getProtocolVersion() {
            return this.protocolVersion;
        }

        /* compiled from: NativeProtocol.kt */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult$Companion;", "", "()V", "create", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "nativeAppInfo", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "protocolVersion", "", "createEmpty", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult create(com.facebook.internal.NativeProtocol.NativeAppInfo nativeAppInfo, int protocolVersion) {
                com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult protocolVersionQueryResult = new com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.appInfo = nativeAppInfo;
                protocolVersionQueryResult.protocolVersion = protocolVersion;
                return protocolVersionQueryResult;
            }

            @kotlin.jvm.JvmStatic
            public final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult createEmpty() {
                com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult protocolVersionQueryResult = new com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.protocolVersion = -1;
                return protocolVersionQueryResult;
            }
        }
    }
}
