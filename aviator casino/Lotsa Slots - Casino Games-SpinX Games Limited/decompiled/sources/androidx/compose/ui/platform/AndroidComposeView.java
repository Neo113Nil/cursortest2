package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(d1 = {"\u0000Ê\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f*\u0002\u00ad\u0001\b\u0000\u0018\u0000 Ê\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006É\u0003Ê\u0003Ë\u0003B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001b\u0010\u0080\u0002\u001a\u0002062\b\u0010ç\u0001\u001a\u00030\u0081\u00022\b\u0010\u0082\u0002\u001a\u00030°\u0001J&\u0010\u0083\u0002\u001a\u0002062\u0007\u0010\u0084\u0002\u001a\u00020>2\b\u0010\u0085\u0002\u001a\u00030\u0086\u00022\b\u0010\u0087\u0002\u001a\u00030\u0088\u0002H\u0002J\u0019\u0010#\u001a\u0002062\u000f\u0010\u0089\u0002\u001a\n\u0012\u0005\u0012\u00030\u008b\u00020\u008a\u0002H\u0016J\t\u0010\u008c\u0002\u001a\u00020aH\u0002J\u0010\u0010\u008d\u0002\u001a\u000206H\u0086@¢\u0006\u0003\u0010\u008e\u0002J\u001e\u0010\u008f\u0002\u001a\u00020z2\u0007\u0010\u0090\u0002\u001a\u00020zH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u001e\u0010\u0093\u0002\u001a\u00020z2\u0007\u0010\u0094\u0002\u001a\u00020zH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0095\u0002\u0010\u0092\u0002J\u0012\u0010\u0096\u0002\u001a\u00020a2\u0007\u0010\u0097\u0002\u001a\u00020>H\u0016J\u0012\u0010\u0098\u0002\u001a\u00020a2\u0007\u0010\u0097\u0002\u001a\u00020>H\u0016J\u0012\u0010\u0099\u0002\u001a\u0002062\u0007\u0010\u009a\u0002\u001a\u00020\u0001H\u0002J\"\u0010\u009b\u0002\u001a\u00030\u009c\u00022\u0007\u0010\u009d\u0002\u001a\u00020>H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J.\u0010 \u0002\u001a\u00020E2\u0014\u0010¡\u0002\u001a\u000f\u0012\u0005\u0012\u00030¢\u0002\u0012\u0004\u0012\u000206042\r\u0010£\u0002\u001a\b\u0012\u0004\u0012\u0002060NH\u0016J\u0013\u0010¤\u0002\u001a\u0002062\b\u0010¥\u0002\u001a\u00030¦\u0002H\u0014J\u0013\u0010§\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u0001H\u0016J\u0013\u0010©\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u0001H\u0016J\u0013\u0010ª\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030«\u0002H\u0016J\u0013\u0010¬\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030«\u0002H\u0016J\u0013\u0010\u00ad\u0002\u001a\u00020a2\b\u0010®\u0002\u001a\u00030©\u0001H\u0016J\u001b\u0010¯\u0002\u001a\u0002062\b\u0010ç\u0001\u001a\u00030\u0081\u00022\b\u0010¥\u0002\u001a\u00030¦\u0002J\u001f\u0010°\u0002\u001a\u0005\u0018\u00010è\u00012\u0007\u0010±\u0002\u001a\u00020>2\b\u0010²\u0002\u001a\u00030è\u0001H\u0002J\u0013\u0010³\u0002\u001a\u0005\u0018\u00010è\u00012\u0007\u0010±\u0002\u001a\u00020>J\u001c\u0010´\u0002\u001a\u0002062\b\u0010\u0082\u0002\u001a\u00030°\u00012\u0007\u0010µ\u0002\u001a\u00020aH\u0016J\"\u0010¶\u0002\u001a\u0005\u0018\u00010·\u00022\b\u0010¸\u0002\u001a\u00030¹\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\bº\u0002\u0010»\u0002J\u0013\u0010¼\u0002\u001a\u0002062\b\u0010½\u0002\u001a\u00030¾\u0002H\u0016J#\u0010¿\u0002\u001a\u00030À\u00022\b\u0010®\u0002\u001a\u00030©\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÁ\u0002\u0010Â\u0002J\u0013\u0010Ã\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u0001H\u0002J\u001d\u0010Ä\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u00012\b\u0010Å\u0002\u001a\u00030©\u0001H\u0002J\t\u0010Æ\u0002\u001a\u000206H\u0016J\u0013\u0010Ç\u0002\u001a\u0002062\b\u0010È\u0002\u001a\u00030°\u0001H\u0002J\u0013\u0010É\u0002\u001a\u0002062\b\u0010È\u0002\u001a\u00030°\u0001H\u0002J\u0013\u0010Ê\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u0001H\u0002J\u0013\u0010Ë\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u0001H\u0002J\u0013\u0010Ì\u0002\u001a\u00020a2\b\u0010®\u0002\u001a\u00030©\u0001H\u0002J\u0013\u0010Í\u0002\u001a\u00020a2\b\u0010¨\u0002\u001a\u00030©\u0001H\u0002J\u001e\u0010Î\u0002\u001a\u00020z2\u0007\u0010\u0094\u0002\u001a\u00020zH\u0016ø\u0001\u0000¢\u0006\u0006\bÏ\u0002\u0010\u0092\u0002J\u001f\u0010Î\u0002\u001a\u0002062\b\u0010Ð\u0002\u001a\u00030á\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÑ\u0002\u0010Ò\u0002J)\u0010Ó\u0002\u001a\u0002062\b\u0010\u0082\u0002\u001a\u00030°\u00012\b\u0010Ô\u0002\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÕ\u0002\u0010Ö\u0002J\u0012\u0010Ó\u0002\u001a\u0002062\u0007\u0010×\u0002\u001a\u00020aH\u0016J\t\u0010Ø\u0002\u001a\u000206H\u0016J!\u0010Ù\u0002\u001a\u0002062\u0007\u0010Ú\u0002\u001a\u00020E2\u0007\u0010Û\u0002\u001a\u00020aH\u0000¢\u0006\u0003\bÜ\u0002J\u0013\u0010Ý\u0002\u001a\u0002062\b\u0010È\u0002\u001a\u00030°\u0001H\u0016J\t\u0010Þ\u0002\u001a\u000206H\u0014J\t\u0010ß\u0002\u001a\u00020aH\u0016J\u0012\u0010à\u0002\u001a\u0002062\u0007\u0010á\u0002\u001a\u000205H\u0014J\u0016\u0010â\u0002\u001a\u0005\u0018\u00010ã\u00022\b\u0010ä\u0002\u001a\u00030å\u0002H\u0016J0\u0010æ\u0002\u001a\u0002062\b\u0010ç\u0002\u001a\u00030è\u00022\b\u0010é\u0002\u001a\u00030ä\u00012\u0011\u0010ê\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ì\u00020ë\u0002H\u0017J\u0013\u0010í\u0002\u001a\u0002062\b\u0010È\u0002\u001a\u00030°\u0001H\u0016J\t\u0010î\u0002\u001a\u000206H\u0014J\u0013\u0010ï\u0002\u001a\u0002062\b\u0010¥\u0002\u001a\u00030¦\u0002H\u0014J\t\u0010ð\u0002\u001a\u000206H\u0016J'\u0010ñ\u0002\u001a\u0002062\u0007\u0010ò\u0002\u001a\u00020a2\u0007\u0010\u0097\u0002\u001a\u00020>2\n\u0010ó\u0002\u001a\u0005\u0018\u00010¾\u0002H\u0014J6\u0010ô\u0002\u001a\u0002062\u0007\u0010õ\u0002\u001a\u00020a2\u0007\u0010ö\u0002\u001a\u00020>2\u0007\u0010÷\u0002\u001a\u00020>2\u0007\u0010ø\u0002\u001a\u00020>2\u0007\u0010ù\u0002\u001a\u00020>H\u0014J\u0013\u0010ú\u0002\u001a\u0002062\b\u0010\u0082\u0002\u001a\u00030°\u0001H\u0016J\u001b\u0010û\u0002\u001a\u0002062\u0007\u0010ü\u0002\u001a\u00020>2\u0007\u0010ý\u0002\u001a\u00020>H\u0014J\u001e\u0010þ\u0002\u001a\u0002062\n\u0010ÿ\u0002\u001a\u0005\u0018\u00010\u0080\u00032\u0007\u0010\u0081\u0003\u001a\u00020>H\u0016J.\u0010\u0082\u0003\u001a\u0002062\b\u0010\u0082\u0002\u001a\u00030°\u00012\u0007\u0010µ\u0002\u001a\u00020a2\u0007\u0010\u0083\u0003\u001a\u00020a2\u0007\u0010\u0084\u0003\u001a\u00020aH\u0016J%\u0010\u0085\u0003\u001a\u0002062\b\u0010\u0082\u0002\u001a\u00030°\u00012\u0007\u0010µ\u0002\u001a\u00020a2\u0007\u0010\u0083\u0003\u001a\u00020aH\u0016J\u0013\u0010\u0086\u0003\u001a\u0002062\b\u0010\u0087\u0003\u001a\u00030\u0088\u0003H\u0016J\u0012\u0010\u0089\u0003\u001a\u0002062\u0007\u0010\u0085\u0001\u001a\u00020>H\u0016J\t\u0010\u008a\u0003\u001a\u000206H\u0016J\u001c\u0010\u008b\u0003\u001a\u0002062\u0011\u0010\u008c\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u00030\u008d\u0003H\u0017J\u0012\u0010\u008f\u0003\u001a\u0002062\u0007\u0010\u0090\u0003\u001a\u00020aH\u0016J+\u0010\u0091\u0003\u001a\u00030\u009c\u00022\u0007\u0010\u0092\u0003\u001a\u00020>2\u0007\u0010ù\u0002\u001a\u00020>H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0003\u0010\u0094\u0003J\t\u0010\u0095\u0003\u001a\u000206H\u0002J\u0013\u0010\u0095\u0003\u001a\u0002062\b\u0010®\u0002\u001a\u00030©\u0001H\u0002J\t\u0010\u0096\u0003\u001a\u000206H\u0002J\u0018\u0010\u0097\u0003\u001a\u00020a2\u0007\u0010Ú\u0002\u001a\u00020EH\u0000¢\u0006\u0003\b\u0098\u0003J\u0018\u0010\u0099\u0003\u001a\u0002062\r\u0010\u009a\u0003\u001a\b\u0012\u0004\u0012\u0002060NH\u0016J\u0013\u0010\u009b\u0003\u001a\u0002062\b\u0010\u009a\u0003\u001a\u00030\u009c\u0003H\u0016J\u0011\u0010\u009d\u0003\u001a\u0002062\b\u0010ç\u0001\u001a\u00030\u0081\u0002J\u0007\u0010\u009e\u0003\u001a\u000206J\u0013\u0010\u009f\u0003\u001a\u0002062\b\u0010\u0082\u0002\u001a\u00030°\u0001H\u0016J\u0017\u0010\u0084\u0003\u001a\u0002062\f\b\u0002\u0010 \u0003\u001a\u0005\u0018\u00010°\u0001H\u0002J\u001e\u0010¡\u0003\u001a\u00020z2\u0007\u0010¢\u0003\u001a\u00020zH\u0016ø\u0001\u0000¢\u0006\u0006\b£\u0003\u0010\u0092\u0002J\u001f\u0010¤\u0003\u001a\u00020a2\b\u0010¸\u0002\u001a\u00030¹\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b¥\u0003\u0010¦\u0003J#\u0010§\u0003\u001a\u00030À\u00022\b\u0010®\u0002\u001a\u00030©\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¨\u0003\u0010Â\u0002J0\u0010©\u0003\u001a\u0002062\b\u0010®\u0002\u001a\u00030©\u00012\u0007\u0010ª\u0003\u001a\u00020>2\u0007\u0010«\u0003\u001a\u00020|2\t\b\u0002\u0010¬\u0003\u001a\u00020aH\u0002J\u001c\u0010\u00ad\u0003\u001a\u0002062\u0013\u0010®\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020604J\t\u0010¯\u0003\u001a\u00020aH\u0016JE\u0010°\u0003\u001a\u00020a2\b\u0010±\u0003\u001a\u00030²\u00032\b\u0010³\u0003\u001a\u00030´\u00032\u001a\u0010µ\u0003\u001a\u0015\u0012\u0005\u0012\u00030¶\u0003\u0012\u0004\u0012\u00020604¢\u0006\u0003\b·\u0003H\u0002ø\u0001\u0000¢\u0006\u0006\b¸\u0003\u0010¹\u0003JA\u0010º\u0003\u001a\u00030»\u00032.\u0010¼\u0003\u001a)\b\u0001\u0012\u0005\u0012\u00030¾\u0003\u0012\f\u0012\n\u0012\u0005\u0012\u00030»\u00030¿\u0003\u0012\u0007\u0012\u0005\u0018\u00010À\u00030½\u0003¢\u0006\u0003\b·\u0003H\u0096@¢\u0006\u0003\u0010Á\u0003J\t\u0010Â\u0003\u001a\u000206H\u0002J\u000e\u0010Ã\u0003\u001a\u00020a*\u00030°\u0001H\u0002J\u001b\u0010Ä\u0003\u001a\u00020>*\u00030\u009c\u0002H\u0082\nø\u0001\u0000¢\u0006\u0006\bÅ\u0003\u0010Æ\u0003J\u001b\u0010Ç\u0003\u001a\u00020>*\u00030\u009c\u0002H\u0082\nø\u0001\u0000¢\u0006\u0006\bÈ\u0003\u0010Æ\u0003R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R&\u00103\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020604X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020GX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010L\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010N0MX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020PX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR+\u0010T\u001a\u00020S2\u0006\u0010\u0011\u001a\u00020S8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0019\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Z\u001a\u00020[8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u000e\u0010`\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010d\u001a\u00020eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010fR\u0014\u0010g\u001a\u00020hX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u000e\u0010n\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010o\u001a\u00020p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u000e\u0010s\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010t\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010mR\u000e\u0010u\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020wX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010y\u001a\u00020zX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010fR&\u0010{\u001a\u00020|8\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0000\u0012\u0004\b}\u0010]\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020E0\u0083\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0011\u001a\u00030\u0084\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010\u0019\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0010\u0010\u008b\u0001\u001a\u00030\u008c\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0091\u0001\u001a\u00020|8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u007fR\u0018\u0010\u0093\u0001\u001a\u00030\u0094\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0010\u0010\u0097\u0001\u001a\u00030\u0098\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001d\u0010\u009c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000206\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u009d\u0001\u001a\u00030\u009e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¡\u0001\u001a\u00030¢\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u0010\u0010¥\u0001\u001a\u00030¦\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010§\u0001\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010ª\u0001\u001a\u00020|X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010«\u0001\u001a\b\u0012\u0004\u0012\u0002060NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010¬\u0001\u001a\u00030\u00ad\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010®\u0001R\u0018\u0010¯\u0001\u001a\u00030°\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010³\u0001\u001a\u00030´\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001R\u000f\u0010·\u0001\u001a\u00020wX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010¸\u0001\u001a\u00030¹\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010º\u0001\u001a\u00030»\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010¼\u0001\u001a\u00030½\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0010\u0010À\u0001\u001a\u00030Á\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010Â\u0001\u001a\u00030Ã\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010Å\u0001R%\u0010Æ\u0001\u001a\u00020aX\u0096\u000e¢\u0006\u0018\n\u0000\u0012\u0005\bÇ\u0001\u0010]\u001a\u0005\bÈ\u0001\u0010m\"\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ì\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ð\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u000f\u0010Ó\u0001\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Ô\u0001\u001a\u00030Õ\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001R \u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Ù\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010Û\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ý\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0019\u0010à\u0001\u001a\u00030á\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010â\u0001R\u0010\u0010ã\u0001\u001a\u00030ä\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010å\u0001\u001a\u00030æ\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010ç\u0001\u001a\u00030è\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ë\u0001\u001a\u00030ì\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bí\u0001\u0010î\u0001R\u0012\u0010ï\u0001\u001a\u0005\u0018\u00010ð\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010ñ\u0001\u001a\u00030á\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010â\u0001R!\u0010ò\u0001\u001a\u0004\u0018\u00010\u00128FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0005\bó\u0001\u0010\u0015R\u000f\u0010ö\u0001\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010÷\u0001\u001a\u00030ø\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0017\u0010û\u0001\u001a\u00020zX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010fR\u0019\u0010ü\u0001\u001a\u00030á\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010â\u0001R\u001b\u0010ý\u0001\u001a\u00020>*\u0002058BX\u0082\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ì\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "<set-?>", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "_viewTreeOwners", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners$delegate", "Landroidx/compose/runtime/MutableState;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "composeAccessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentFontWeightAdjustment", "", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropModifierOnDragListener", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "endApplyChangesListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver$delegate", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "()V", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hoverExitReceived", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "isDrawingContent", "isLifecycleInResumedState", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/Modifier;", "keyboardModifiersRequireUpdate", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "resendMotionEventOnLayout", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rotaryInputModifier", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "superclassInitComplete", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputSessionMutex", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "tmpPositionArray", "", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "viewTreeOwners", "getViewTreeOwners", "viewTreeOwners$delegate", "Landroidx/compose/runtime/State;", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "windowToViewMatrix", "fontWeightAdjustmentCompat", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "canScrollHorizontally", "direction", "canScrollVertically", "clearChildInvalidObservations", "viewGroup", "convertMeasureSpec", "Lkotlin/ULong;", "measureSpec", "convertMeasureSpec-I7RO_PI", "(I)J", "createLayer", "drawBlock", "Landroidx/compose/ui/graphics/Canvas;", "invalidateParentLayer", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchGenericMotionEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "dispatchHoverEvent", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchKeyEventPreIme", "dispatchTouchEvent", "motionEvent", "drawAndroidView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "forceMeasureTheSubtree", "affectsLookahead", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusedRect", "rect", "Landroid/graphics/Rect;", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleRotaryEvent", "hasChangedDevices", "lastEvent", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "isBadMotionEvent", "isDevicePressEvent", "isInBounds", "isPositionChanged", "localToScreen", "localToScreen-MK-Hz9U", "localTransform", "localToScreen-58bKbWc", "([F)V", "measureAndLayout", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "measureAndLayoutForTest", "notifyLayerIsDirty", "layer", "isDirty", "notifyLayerIsDirty$ui_release", "onAttach", "onAttachedToWindow", "onCheckIsTextEditor", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onDetach", "onDetachedFromWindow", "onDraw", "onEndApplyChanges", "onFocusChanged", "gainFocus", "previouslyFocusedRect", "onLayout", "changed", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "t", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "b", "onLayoutChange", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onProvideAutofillVirtualStructure", "structure", "Landroid/view/ViewStructure;", "flags", "onRequestMeasure", "forceRequest", "scheduleMeasureAndLayout", "onRequestRelayout", com.ironsource.X3.i.u0, "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onSemanticsChange", "onVirtualViewTranslationResponses", com.ironsource.Ve.n, "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onWindowFocusChanged", "hasWindowFocus", "pack", "a", "pack-ZIaKswc", "(II)J", "recalculateWindowPosition", "recalculateWindowViewTransforms", "recycle", "recycle$ui_release", "registerOnEndApplyChangesListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "removeAndroidView", "requestClearInvalidObservations", "requestOnPositionedCallback", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "setOnViewTreeOwnersAvailable", "callback", "shouldDelayChildPressedState", "startDrag", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "startDrag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "textInputSession", "", "session", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePositionCacheAndDispatch", "childSizeCanAffectParentSize", "component1", "component1-VKZWuLQ", "(J)I", "component2", "component2-VKZWuLQ", "AndroidComposeViewTranslationCallback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView extends android.view.ViewGroup implements androidx.compose.ui.node.Owner, androidx.compose.ui.platform.ViewRootForTest, androidx.compose.ui.input.pointer.PositionCalculator, androidx.lifecycle.DefaultLifecycleObserver {
    private static final java.lang.String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;
    private static java.lang.reflect.Method getBooleanMethod;
    private static java.lang.Class<?> systemPropertiesClass;
    private androidx.compose.ui.platform.AndroidViewsHandler _androidViewsHandler;
    private final androidx.compose.ui.autofill.AndroidAutofill _autofill;
    private final androidx.compose.ui.input.InputModeManagerImpl _inputModeManager;

    /* renamed from: _viewTreeOwners$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState _viewTreeOwners;
    private final androidx.compose.ui.platform.WindowInfoImpl _windowInfo;
    private final androidx.compose.ui.platform.AndroidAccessibilityManager accessibilityManager;
    private final androidx.compose.ui.autofill.AutofillTree autofillTree;
    private final androidx.compose.ui.graphics.CanvasHolder canvasHolder;
    private final androidx.compose.ui.platform.AndroidClipboardManager clipboardManager;
    private final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private kotlin.jvm.functions.Function1<? super android.content.res.Configuration, kotlin.Unit> configurationChangeObserver;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private int currentFontWeightAdjustment;
    private androidx.compose.ui.unit.Density density;
    private final java.util.List<androidx.compose.ui.node.OwnedLayer> dirtyLayers;
    private final androidx.compose.ui.draganddrop.DragAndDropManager dragAndDropManager;
    private final androidx.compose.ui.platform.DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;
    private final androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function0<kotlin.Unit>> endApplyChangesListeners;
    private final androidx.compose.ui.focus.FocusOwner focusOwner;

    /* renamed from: fontFamilyResolver$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState fontFamilyResolver;
    private final androidx.compose.ui.text.font.Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final androidx.compose.ui.Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final androidx.compose.ui.platform.WeakCache<androidx.compose.ui.node.OwnedLayer> layerCache;

    /* renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState layoutDirection;
    private final androidx.compose.ui.text.input.TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final androidx.compose.ui.platform.CalculateMatrixToWindow matrixToWindow;
    private final androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final androidx.compose.ui.modifier.ModifierLocalManager modifierLocalManager;
    private final androidx.compose.ui.input.pointer.MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private androidx.compose.ui.unit.Constraints onMeasureConstraints;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit> onViewTreeOwnersAvailable;
    private final androidx.compose.ui.input.pointer.PointerIconService pointerIconService;
    private final androidx.compose.ui.input.pointer.PointerInputEventProcessor pointerInputEventProcessor;
    private java.util.List<androidx.compose.ui.node.OwnedLayer> postponedDirtyLayers;
    private android.view.MotionEvent previousMotionEvent;
    private long relayoutTime;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> resendMotionEventOnLayout;
    private final androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final androidx.compose.ui.node.LayoutNode root;
    private final androidx.compose.ui.node.RootForTest rootForTest;
    private final androidx.compose.ui.Modifier rotaryInputModifier;
    private final android.view.ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final androidx.compose.ui.semantics.EmptySemanticsElement semanticsModifier;
    private final androidx.compose.ui.semantics.SemanticsOwner semanticsOwner;
    private final java.lang.Runnable sendHoverExitEvent;
    private final androidx.compose.ui.node.LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver;
    private final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final androidx.compose.ui.text.input.TextInputService textInputService;
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> textInputSessionMutex;
    private final androidx.compose.ui.platform.TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final androidx.compose.ui.platform.ViewConfiguration viewConfiguration;
    private androidx.compose.ui.platform.DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;

    /* renamed from: viewTreeOwners$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State viewTreeOwners;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.AndroidComposeView.Companion INSTANCE = new androidx.compose.ui.platform.AndroidComposeView.Companion(null);
    public static final int $stable = 8;

    @kotlin.Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(androidx.compose.ui.node.LayoutNode node) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(context);
        androidx.compose.ui.platform.CalculateMatrixToWindowApi21 calculateMatrixToWindowApi21;
        this.coroutineContext = coroutineContext;
        this.lastDownPointerPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        this.sharedDrawScope = new androidx.compose.ui.node.LayoutNodeDrawScope(null, 1, 0 == true ? 1 : 0);
        this.density = androidx.compose.ui.unit.AndroidDensity_androidKt.Density(context);
        androidx.compose.ui.semantics.EmptySemanticsElement emptySemanticsElement = androidx.compose.ui.semantics.EmptySemanticsElement.INSTANCE;
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new androidx.compose.ui.focus.FocusOwnerImpl(new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
                invoke2((kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                androidx.compose.ui.platform.AndroidComposeView.this.registerOnEndApplyChangesListener(function0);
            }
        });
        androidx.compose.ui.platform.DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new androidx.compose.ui.platform.DragAndDropModifierOnDragListener(new androidx.compose.ui.platform.AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new androidx.compose.ui.platform.WindowInfoImpl();
        androidx.compose.ui.Modifier onKeyEvent = androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                return m3700invokeZmokQxo(keyEvent.m3123unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final java.lang.Boolean m3700invokeZmokQxo(android.view.KeyEvent keyEvent) {
                androidx.compose.ui.focus.FocusDirection mo3668getFocusDirectionP8AzH3I = androidx.compose.ui.platform.AndroidComposeView.this.mo3668getFocusDirectionP8AzH3I(keyEvent);
                if (mo3668getFocusDirectionP8AzH3I == null || !androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(keyEvent), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY())) {
                    return false;
                }
                return java.lang.Boolean.valueOf(androidx.compose.ui.platform.AndroidComposeView.this.getFocusOwner().mo1805moveFocus3ESFkO8(mo3668getFocusDirectionP8AzH3I.getValue()));
            }
        });
        this.keyInputModifier = onKeyEvent;
        androidx.compose.ui.Modifier onRotaryScrollEvent = androidx.compose.ui.input.rotary.RotaryInputModifierKt.onRotaryScrollEvent(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.input.rotary.RotaryScrollEvent rotaryScrollEvent) {
                return false;
            }
        });
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new androidx.compose.ui.graphics.CanvasHolder();
        androidx.compose.ui.node.LayoutNode layoutNode = new androidx.compose.ui.node.LayoutNode(false, 0, 3, null);
        layoutNode.setMeasurePolicy(androidx.compose.ui.layout.RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(androidx.compose.ui.Modifier.INSTANCE.then(emptySemanticsElement).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent).then(dragAndDropModifierOnDragListener.getModifier()));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new androidx.compose.ui.semantics.SemanticsOwner(getRoot());
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new androidx.compose.ui.autofill.AutofillTree();
        this.dirtyLayers = new java.util.ArrayList();
        this.motionEventAdapter = new androidx.compose.ui.input.pointer.MotionEventAdapter();
        this.pointerInputEventProcessor = new androidx.compose.ui.input.pointer.PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new kotlin.jvm.functions.Function1<android.content.res.Configuration, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(android.content.res.Configuration configuration) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.content.res.Configuration configuration) {
                invoke2(configuration);
                return kotlin.Unit.INSTANCE;
            }
        };
        this._autofill = autofillSupported() ? new androidx.compose.ui.autofill.AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new androidx.compose.ui.platform.AndroidClipboardManager(context);
        this.accessibilityManager = new androidx.compose.ui.platform.AndroidAccessibilityManager(context);
        this.snapshotObserver = new androidx.compose.ui.node.OwnerSnapshotObserver(new androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new androidx.compose.ui.node.MeasureAndLayoutDelegate(getRoot());
        this.viewConfiguration = new androidx.compose.ui.platform.AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.globalPosition = androidx.compose.ui.unit.IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] m2352constructorimpl$default = androidx.compose.ui.graphics.Matrix.m2352constructorimpl$default(null, 1, null);
        this.tmpMatrix = m2352constructorimpl$default;
        this.viewToWindowMatrix = androidx.compose.ui.graphics.Matrix.m2352constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = androidx.compose.ui.graphics.Matrix.m2352constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m1885getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewTreeOwners = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners invoke() {
                androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners;
                viewTreeOwners = androidx.compose.ui.platform.AndroidComposeView.this.get_viewTreeOwners();
                return viewTreeOwners;
            }
        });
        this.globalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                androidx.compose.ui.platform.AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.scrollChangedListener = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                androidx.compose.ui.platform.AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.touchModeChangeListener = new android.view.ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                androidx.compose.ui.platform.AndroidComposeView.touchModeChangeListener$lambda$3(androidx.compose.ui.platform.AndroidComposeView.this, z);
            }
        };
        androidx.compose.ui.text.input.TextInputServiceAndroid textInputServiceAndroid = new androidx.compose.ui.text.input.TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new androidx.compose.ui.text.input.TextInputService(androidx.compose.ui.platform.AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = androidx.compose.ui.SessionMutex.m1751constructorimpl();
        this.softwareKeyboardController = new androidx.compose.ui.platform.DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new androidx.compose.ui.platform.AndroidFontResourceLoader(context);
        this.fontFamilyResolver = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.ui.text.font.FontFamilyResolver_androidKt.createFontFamilyResolver(context), androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy());
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        this.layoutDirection = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.platform.AndroidComposeView_androidKt.getLocaleLayoutDirection(context.getResources().getConfiguration()), null, 2, null);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        this.hapticFeedBack = new androidx.compose.ui.hapticfeedback.PlatformHapticFeedback(androidComposeView);
        this._inputModeManager = new androidx.compose.ui.input.InputModeManagerImpl(isInTouchMode() ? androidx.compose.ui.input.InputMode.INSTANCE.m2817getTouchaOaMEAU() : androidx.compose.ui.input.InputMode.INSTANCE.m2816getKeyboardaOaMEAU(), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.InputMode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.InputMode inputMode) {
                return m3698invokeiuPiT84(inputMode.getValue());
            }

            /* renamed from: invoke-iuPiT84, reason: not valid java name */
            public final java.lang.Boolean m3698invokeiuPiT84(int i) {
                boolean requestFocusFromTouch;
                if (androidx.compose.ui.input.InputMode.m2812equalsimpl0(i, androidx.compose.ui.input.InputMode.INSTANCE.m2817getTouchaOaMEAU())) {
                    requestFocusFromTouch = androidx.compose.ui.platform.AndroidComposeView.this.isInTouchMode();
                } else {
                    requestFocusFromTouch = androidx.compose.ui.input.InputMode.m2812equalsimpl0(i, androidx.compose.ui.input.InputMode.INSTANCE.m2816getKeyboardaOaMEAU()) ? androidx.compose.ui.platform.AndroidComposeView.this.isInTouchMode() ? androidx.compose.ui.platform.AndroidComposeView.this.requestFocusFromTouch() : true : false;
                }
                return java.lang.Boolean.valueOf(requestFocusFromTouch);
            }
        }, null);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = this;
        this.modifierLocalManager = new androidx.compose.ui.modifier.ModifierLocalManager(androidComposeView2);
        this.textToolbar = new androidx.compose.ui.platform.AndroidTextToolbar(androidComposeView);
        this.layerCache = new androidx.compose.ui.platform.WeakCache<>();
        this.endApplyChangesListeners = new androidx.compose.runtime.collection.MutableVector<>(new kotlin.jvm.functions.Function0[16], 0);
        this.resendMotionEventRunnable = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                android.view.MotionEvent motionEvent;
                long j;
                androidx.compose.ui.platform.AndroidComposeView.this.removeCallbacks(this);
                motionEvent = androidx.compose.ui.platform.AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = androidx.compose.ui.platform.AndroidComposeView.this;
                    j = androidComposeView3.relayoutTime;
                    androidComposeView3.sendSimulatedEvent(motionEvent, i, j, false);
                }
            }
        };
        this.sendHoverExitEvent = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.AndroidComposeView.sendHoverExitEvent$lambda$5(androidx.compose.ui.platform.AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                android.view.MotionEvent motionEvent;
                androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
                motionEvent = androidx.compose.ui.platform.AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        androidx.compose.ui.platform.AndroidComposeView.this.relayoutTime = android.os.SystemClock.uptimeMillis();
                        androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = androidx.compose.ui.platform.AndroidComposeView.this;
                        androidComposeView$resendMotionEventRunnable$1 = androidComposeView3.resendMotionEventRunnable;
                        androidComposeView3.post(androidComposeView$resendMotionEventRunnable$1);
                    }
                }
            }
        };
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            calculateMatrixToWindowApi21 = new androidx.compose.ui.platform.CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindowApi21 = new androidx.compose.ui.platform.CalculateMatrixToWindowApi21(m2352constructorimpl$default, null);
        }
        this.matrixToWindow = calculateMatrixToWindowApi21;
        setWillNotDraw(false);
        setFocusable(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(androidComposeView, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(androidComposeView, androidComposeViewAccessibilityDelegateCompat);
        kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ViewRootForTest, kotlin.Unit> onViewCreatedCallback = androidx.compose.ui.platform.ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().attach$ui_release(androidComposeView2);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(androidComposeView);
        }
        this.pointerIconService = new androidx.compose.ui.input.pointer.PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private androidx.compose.ui.input.pointer.PointerIcon currentIcon = androidx.compose.ui.input.pointer.PointerIcon.INSTANCE.getDefault();

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            /* renamed from: getIcon, reason: from getter */
            public androidx.compose.ui.input.pointer.PointerIcon getCurrentIcon() {
                return this.currentIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(androidx.compose.ui.input.pointer.PointerIcon value) {
                if (value == null) {
                    value = androidx.compose.ui.input.pointer.PointerIcon.INSTANCE.getDefault();
                }
                this.currentIcon = value;
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(androidx.compose.ui.platform.AndroidComposeView.this, this.currentIcon);
                }
            }
        };
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public android.view.View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.focus.FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.draganddrop.DragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.platform.WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public androidx.compose.ui.semantics.SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.autofill.AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final kotlin.jvm.functions.Function1<android.content.res.Configuration, kotlin.Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public final void setConfigurationChangeObserver(kotlin.jvm.functions.Function1<? super android.content.res.Configuration, kotlin.Unit> function1) {
        this.configurationChangeObserver = function1;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.autofill.Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.platform.AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.platform.AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public final androidx.compose.ui.platform.AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler = new androidx.compose.ui.platform.AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        kotlin.jvm.internal.Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners get_viewTreeOwners() {
        return (androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners) this._viewTreeOwners.getValue();
    }

    private final void set_viewTreeOwners(androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners.setValue(viewTreeOwners);
    }

    public final androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners getViewTreeOwners() {
        return (androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(androidx.compose.ui.platform.AndroidComposeView androidComposeView, boolean z) {
        androidComposeView._inputModeManager.m2820setInputModeiuPiT84(z ? androidx.compose.ui.input.InputMode.INSTANCE.m2817getTouchaOaMEAU() : androidx.compose.ui.input.InputMode.INSTANCE.m2816getKeyboardaOaMEAU());
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public androidx.compose.ui.text.input.TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.platform.SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.layout.Placeable.PlacementScope getPlacementScope() {
        return androidx.compose.ui.layout.PlaceableKt.PlacementScope(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSessionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object textInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) continuation;
            if ((androidComposeView$textInputSession$1.label & Integer.MIN_VALUE) != 0) {
                androidComposeView$textInputSession$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidComposeView$textInputSession$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidComposeView$textInputSession$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference = this.textInputSessionMutex;
                    kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.AndroidPlatformTextInputSession> function1 = new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.AndroidPlatformTextInputSession>() { // from class: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final androidx.compose.ui.platform.AndroidPlatformTextInputSession invoke(kotlinx.coroutines.CoroutineScope coroutineScope) {
                            androidx.compose.ui.platform.AndroidComposeView androidComposeView = androidx.compose.ui.platform.AndroidComposeView.this;
                            return new androidx.compose.ui.platform.AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), coroutineScope);
                        }
                    };
                    androidComposeView$textInputSession$1.label = 1;
                    if (androidx.compose.ui.SessionMutex.m1758withSessionCancellingPreviousimpl(atomicReference, function1, function2, androidComposeView$textInputSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidComposeView$textInputSession$1 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1(this, continuation);
        java.lang.Object obj2 = androidComposeView$textInputSession$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeView$textInputSession$1.label;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.text.font.Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    private final int getFontWeightAdjustmentCompat(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return (androidx.compose.ui.unit.LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.input.InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.modifier.ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.platform.TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        android.view.MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        androidComposeView.m3696sendMotionEvent8iAsVTc(motionEvent);
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        kotlin.Unit unit;
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = kotlin.math.MathKt.roundToInt(focusRect.getLeft());
            rect.top = kotlin.math.MathKt.roundToInt(focusRect.getTop());
            rect.right = kotlin.math.MathKt.roundToInt(focusRect.getRight());
            rect.bottom = kotlin.math.MathKt.roundToInt(focusRect.getBottom());
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(androidx.lifecycle.LifecycleOwner owner) {
        setShowLayoutBounds(INSTANCE.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    protected void onFocusChanged(final boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        android.util.Log.d(FocusTag, "Owner FocusChanged(" + gainFocus + ')');
        androidx.compose.ui.focus.FocusTransactionManager focusTransactionManager = getFocusOwner().getFocusTransactionManager();
        focusTransactionManager.cancellationListener.add(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$onFocusChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (gainFocus) {
                    this.clearFocus();
                } else {
                    this.requestFocus();
                }
            }
        });
        if (focusTransactionManager.ongoingTransaction) {
            if (gainFocus) {
                getFocusOwner().takeFocus();
                return;
            } else {
                getFocusOwner().releaseFocus();
                return;
            }
        }
        try {
            focusTransactionManager.beginTransaction();
            if (gainFocus) {
                getFocusOwner().takeFocus();
            } else {
                getFocusOwner().releaseFocus();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (isShowingLayoutBounds = INSTANCE.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo3670sendKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        return getFocusOwner().mo1806dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || getFocusOwner().mo1807dispatchKeyEventZmokQxo(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        if (isFocused()) {
            this._windowInfo.m3774setKeyboardModifiers5xRPYO0(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m3339constructorimpl(event.getMetaState()));
            return getFocusOwner().mo1807dispatchKeyEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m3118constructorimpl(event)) || super.dispatchKeyEvent(event);
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent event) {
        return (isFocused() && getFocusOwner().mo1806dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m3118constructorimpl(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(androidx.compose.ui.node.LayoutNode node) {
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i = 0; i < size; i++) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.endApplyChangesListeners.getContent()[i];
                this.endApplyChangesListeners.set(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        if (this.endApplyChangesListeners.contains(listener)) {
            return;
        }
        this.endApplyChangesListeners.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m3697startDrag12SF9DM(androidx.compose.ui.draganddrop.DragAndDropTransferData transferData, long decorationSize, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawDragDecoration) {
        android.content.res.Resources resources = getContext().getResources();
        androidx.compose.ui.draganddrop.ComposeDragShadowBuilder composeDragShadowBuilder = new androidx.compose.ui.draganddrop.ComposeDragShadowBuilder(androidx.compose.ui.unit.DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.compose.ui.platform.AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, transferData, composeDragShadowBuilder);
        }
        return startDrag(transferData.getClipData(), composeDragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }

    private final void clearChildInvalidObservations(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof androidx.compose.ui.platform.AndroidComposeView) {
                ((androidx.compose.ui.platform.AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof android.view.ViewGroup) {
                clearChildInvalidObservations((android.view.ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, android.view.accessibility.AccessibilityNodeInfo info, java.lang.String extraDataKey) {
        java.lang.Integer num;
        if (kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal())) {
            java.lang.Integer num2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().get(java.lang.Integer.valueOf(virtualViewId));
            if (num2 != null) {
                info.getExtras().putInt(extraDataKey, num2.intValue());
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal()) || (num = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().get(java.lang.Integer.valueOf(virtualViewId))) == null) {
            return;
        }
        info.getExtras().putInt(extraDataKey, num.intValue());
    }

    public final void addAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder view, final androidx.compose.ui.node.LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = view;
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        androidx.core.view.ViewCompat.setImportantForAccessibility(androidViewHolder, 1);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(androidViewHolder, new androidx.core.view.AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
            
                if (r6.intValue() == r5.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L12;
             */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View host, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info) {
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (androidx.compose.ui.platform.AndroidComposeView.this.composeAccessibilityDelegate.isEnabledForAccessibility$ui_release()) {
                    info.setVisibleToUser(false);
                }
                androidx.compose.ui.node.LayoutNode findClosestParentNode = androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(layoutNode, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode2) {
                        return java.lang.Boolean.valueOf(layoutNode2.getNodes().m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(8)));
                    }
                });
                java.lang.Integer valueOf = findClosestParentNode != null ? java.lang.Integer.valueOf(findClosestParentNode.getSemanticsId()) : null;
                if (valueOf != null) {
                }
                valueOf = -1;
                info.setParent(this, valueOf.intValue());
                int semanticsId = layoutNode.getSemanticsId();
                java.lang.Integer num = androidx.compose.ui.platform.AndroidComposeView.this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().get(java.lang.Integer.valueOf(semanticsId));
                if (num != null) {
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView = androidx.compose.ui.platform.AndroidComposeView.this;
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = this;
                    int intValue = num.intValue();
                    android.view.View semanticsIdToView = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui_release(), num.intValue());
                    if (semanticsIdToView != null) {
                        info.setTraversalBefore(semanticsIdToView);
                    } else {
                        info.setTraversalBefore(androidComposeView2, intValue);
                    }
                    androidComposeView.addExtraDataToAccessibilityNodeInfoHelper(semanticsId, info.unwrap(), androidComposeView.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal());
                }
                java.lang.Integer num2 = androidx.compose.ui.platform.AndroidComposeView.this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().get(java.lang.Integer.valueOf(semanticsId));
                if (num2 != null) {
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = androidx.compose.ui.platform.AndroidComposeView.this;
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView4 = this;
                    int intValue2 = num2.intValue();
                    android.view.View semanticsIdToView2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(androidComposeView3.getAndroidViewsHandler$ui_release(), num2.intValue());
                    if (semanticsIdToView2 != null) {
                        info.setTraversalAfter(semanticsIdToView2);
                    } else {
                        info.setTraversalAfter(androidComposeView4, intValue2);
                    }
                    androidComposeView3.addExtraDataToAccessibilityNodeInfoHelper(semanticsId, info.unwrap(), androidComposeView3.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal());
                }
            }
        });
    }

    public final void removeAndroidView(final androidx.compose.ui.viewinterop.AndroidViewHolder view) {
        registerOnEndApplyChangesListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.platform.AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(view);
                java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.viewinterop.AndroidViewHolder> layoutNodeToHolder = androidx.compose.ui.platform.AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                kotlin.jvm.internal.TypeIntrinsics.asMutableMap(layoutNodeToHolder).remove(androidx.compose.ui.platform.AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
                androidx.core.view.ViewCompat.setImportantForAccessibility(view, 0);
            }
        });
    }

    public final void drawAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder view, android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.ui.node.LayoutNode layoutNode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    private final void scheduleMeasureAndLayout(androidx.compose.ui.node.LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.getMeasuredByParent$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.getParent$ui_release();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final boolean childSizeCanAffectParentSize(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.LayoutNode parent$ui_release;
        return this.wasMeasuredWithMultipleConstraints || !((parent$ui_release = layoutNode.getParent$ui_release()) == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release());
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    function0 = this.resendMotionEventOnLayout;
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
                requestLayout();
            }
            androidx.compose.ui.node.MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo3669measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode layoutNode, long constraints) {
        android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m3569measureAndLayout0kLqBqw(layoutNode, constraints);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                androidx.compose.ui.node.MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, affectsLookahead);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, forceRequest)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        androidx.compose.ui.node.Owner.CC.measureAndLayout$default(this, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (androidx.compose.ui.unit.Constraints.m4417equalsimpl0(r0.getValue(), r9) == false) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        android.os.Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long m3693convertMeasureSpecI7RO_PI = m3693convertMeasureSpecI7RO_PI(widthMeasureSpec);
            int m10975constructorimpl = (int) kotlin.ULong.m10975constructorimpl(m3693convertMeasureSpecI7RO_PI >>> 32);
            int m10975constructorimpl2 = (int) kotlin.ULong.m10975constructorimpl(m3693convertMeasureSpecI7RO_PI & 4294967295L);
            long m3693convertMeasureSpecI7RO_PI2 = m3693convertMeasureSpecI7RO_PI(heightMeasureSpec);
            long Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(m10975constructorimpl, m10975constructorimpl2, (int) kotlin.ULong.m10975constructorimpl(m3693convertMeasureSpecI7RO_PI2 >>> 32), (int) kotlin.ULong.m10975constructorimpl(4294967295L & m3693convertMeasureSpecI7RO_PI2));
            androidx.compose.ui.unit.Constraints constraints = this.onMeasureConstraints;
            if (constraints == null) {
                this.onMeasureConstraints = androidx.compose.ui.unit.Constraints.m4412boximpl(Constraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                }
                this.wasMeasuredWithMultipleConstraints = true;
            }
            this.measureAndLayoutDelegate.m3570updateRootConstraintsBRTryo0(Constraints);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(android.view.View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m3691component1VKZWuLQ(long j) {
        return (int) kotlin.ULong.m10975constructorimpl(j >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m3692component2VKZWuLQ(long j) {
        return (int) kotlin.ULong.m10975constructorimpl(j & 4294967295L);
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m3695packZIaKswc(int a2, int b) {
        return kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(b) | kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(a2) << 32));
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m3693convertMeasureSpecI7RO_PI(int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        int size = android.view.View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return m3695packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m3695packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m3695packZIaKswc(size, size);
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r - l, b - t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int m4602component1impl = androidx.compose.ui.unit.IntOffset.m4602component1impl(j);
        int m4603component2impl = androidx.compose.ui.unit.IntOffset.m4603component2impl(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        int i = iArr[0];
        if (m4602component1impl != i || m4603component2impl != iArr[1]) {
            this.globalPosition = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i, iArr[1]);
            if (m4602component1impl != Integer.MAX_VALUE && m4603component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.node.OwnedLayer createLayer(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer) {
        androidx.compose.ui.platform.ViewLayerContainer viewLayerContainer;
        androidx.compose.ui.node.OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(drawBlock, invalidateParentLayer);
            return pop;
        }
        if (isHardwareAccelerated() && android.os.Build.VERSION.SDK_INT >= 23 && this.isRenderNodeCompatible) {
            try {
                return new androidx.compose.ui.platform.RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (java.lang.Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            if (!androidx.compose.ui.platform.ViewLayer.INSTANCE.getHasRetrievedMethod()) {
                androidx.compose.ui.platform.ViewLayer.INSTANCE.updateDisplayList(new android.view.View(getContext()));
            }
            if (androidx.compose.ui.platform.ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
                viewLayerContainer = new androidx.compose.ui.platform.DrawChildContainer(getContext());
            } else {
                viewLayerContainer = new androidx.compose.ui.platform.ViewLayerContainer(getContext());
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        androidx.compose.ui.platform.DrawChildContainer drawChildContainer = this.viewLayersContainer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawChildContainer);
        return new androidx.compose.ui.platform.ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    public final boolean recycle$ui_release(androidx.compose.ui.node.OwnedLayer layer) {
        boolean z = this.viewLayersContainer == null || androidx.compose.ui.platform.ViewLayer.INSTANCE.getShouldUseDispatchDraw() || android.os.Build.VERSION.SDK_INT >= 23 || this.layerCache.getSize() < 10;
        if (z) {
            this.layerCache.push(layer);
        }
        return z;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(androidx.compose.ui.node.Owner.OnLayoutCompletedListener listener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(listener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: getFocusDirection-P8AzH3I */
    public androidx.compose.ui.focus.FocusDirection mo3668getFocusDirectionP8AzH3I(android.view.KeyEvent keyEvent) {
        long m3134getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(keyEvent);
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m3062getTabEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.input.key.KeyEvent_androidKt.m3140isShiftPressedZmokQxo(keyEvent) ? androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2903getDirectionRightEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2902getDirectionLeftEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2904getDirectionUpEK5gGoQ()) || androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m3015getPageUpEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2899getDirectionDownEK5gGoQ()) || androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m3014getPageDownEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2898getDirectionCenterEK5gGoQ()) || androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2912getEnterEK5gGoQ()) || androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m3004getNumPadEnterEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2841getBackEK5gGoQ()) || androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m2915getEscapeEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m1788boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m1799getExitdhqQ8s());
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        androidx.compose.ui.node.Owner.CC.measureAndLayout$default(this, false, 1, null);
        androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
        this.isDrawingContent = true;
        androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        if (androidx.compose.ui.platform.ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        java.util.List<androidx.compose.ui.node.OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public final void notifyLayerIsDirty$ui_release(androidx.compose.ui.node.OwnedLayer layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            java.util.List<androidx.compose.ui.node.OwnedLayer> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        java.util.ArrayList arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(layer);
    }

    public final void setOnViewTreeOwnersAvailable(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit> callback) {
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    public final java.lang.Object boundsUpdatesEventLoop(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object boundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(continuation);
        return boundsUpdatesEventLoop$ui_release == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? boundsUpdatesEventLoop$ui_release : kotlin.Unit.INSTANCE;
    }

    private final void invalidateLayoutNodeMeasurement(androidx.compose.ui.node.LayoutNode node) {
        int i = 0;
        androidx.compose.ui.node.MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, node, false, 2, null);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = node.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i]);
                i++;
            } while (i < size);
        }
    }

    private final void invalidateLayers(androidx.compose.ui.node.LayoutNode node) {
        node.invalidateLayers$ui_release();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = node.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                invalidateLayers(content[i]);
                i++;
            } while (i < size);
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        androidx.lifecycle.Lifecycle lifecycle;
        androidx.compose.ui.autofill.AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            androidx.compose.ui.autofill.AutofillCallback.INSTANCE.register(androidAutofill);
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.lifecycle.LifecycleOwner lifecycleOwner2 = androidx.lifecycle.ViewTreeLifecycleOwner.get(androidComposeView);
        androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(androidComposeView);
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner2.getLifecycle().addObserver(this);
            androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners2 = new androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m2820setInputModeiuPiT84(isInTouchMode() ? androidx.compose.ui.input.InputMode.INSTANCE.m2817getTouchaOaMEAU() : androidx.compose.ui.input.InputMode.INSTANCE.m2816getKeyboardaOaMEAU());
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners4 = getViewTreeOwners();
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewTreeOwners4);
        viewTreeOwners4.getLifecycleOwner().getLifecycle().addObserver(this.composeAccessibilityDelegate);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(androidComposeView, new androidx.compose.ui.platform.AndroidComposeView.AndroidComposeViewTranslationCallback());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.compose.ui.autofill.AndroidAutofill androidAutofill;
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        androidx.lifecycle.Lifecycle lifecycle;
        androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        androidx.lifecycle.Lifecycle lifecycle2;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner2 = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.removeObserver(this);
        }
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner = viewTreeOwners2.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.composeAccessibilityDelegate);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            androidx.compose.ui.autofill.AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int flags) {
        androidx.compose.ui.autofill.AndroidAutofill androidAutofill;
        if (!autofillSupported() || structure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        androidx.compose.ui.autofill.AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
    }

    @Override // android.view.View
    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> values) {
        androidx.compose.ui.autofill.AndroidAutofill androidAutofill;
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        androidx.compose.ui.autofill.AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> requestsCollector) {
        this.composeAccessibilityDelegate.onCreateVirtualViewTranslationRequests$ui_release(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> response) {
        this.composeAccessibilityDelegate.onVirtualViewTranslationResponses$ui_release(response);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent event) {
        if (event.getActionMasked() == 8) {
            if (event.isFromSource(4194304)) {
                return handleRotaryEvent(event);
            }
            if (isBadMotionEvent(event) || !isAttachedToWindow()) {
                return super.dispatchGenericMotionEvent(event);
            }
            return androidx.compose.ui.input.pointer.ProcessResult.m3365getDispatchedToAPointerInputModifierimpl(m3694handleMotionEvent8iAsVTc(event));
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            android.view.MotionEvent motionEvent2 = this.previousMotionEvent;
            kotlin.jvm.internal.Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int m3694handleMotionEvent8iAsVTc = m3694handleMotionEvent8iAsVTc(motionEvent);
        if (androidx.compose.ui.input.pointer.ProcessResult.m3364getAnyMovementConsumedimpl(m3694handleMotionEvent8iAsVTc)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return androidx.compose.ui.input.pointer.ProcessResult.m3365getDispatchedToAPointerInputModifierimpl(m3694handleMotionEvent8iAsVTc);
    }

    private final boolean handleRotaryEvent(android.view.MotionEvent event) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -event.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new androidx.compose.ui.input.rotary.RotaryScrollEvent(f * androidx.core.view.ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()), f * androidx.core.view.ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), event.getEventTime(), event.getDeviceId()));
    }

    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m3694handleMotionEvent8iAsVTc(android.view.MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            android.os.Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                android.view.MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                    if (isDevicePressEvent(motionEvent2)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = android.view.MotionEvent.obtainNoHistory(motionEvent);
                return m3696sendMotionEvent8iAsVTc(motionEvent);
            } finally {
                android.os.Trace.endSection();
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean hasChangedDevices(android.view.MotionEvent event, android.view.MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final boolean isDevicePressEvent(android.view.MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m3696sendMotionEvent8iAsVTc(android.view.MotionEvent motionEvent) {
        androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m3774setKeyboardModifiers5xRPYO0(androidx.compose.ui.input.pointer.PointerKeyboardModifiers.m3339constructorimpl(motionEvent.getMetaState()));
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.compose.ui.input.pointer.PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, androidComposeView);
        if (convertToPointerInputEvent$ui_release != null) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (pointerInputEventData.getDown()) {
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            pointerInputEventData = null;
            androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m3292getPositionF1C5BW0();
            }
            int m3297processBIzXfog = this.pointerInputEventProcessor.m3297processBIzXfog(convertToPointerInputEvent$ui_release, androidComposeView, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || androidx.compose.ui.input.pointer.ProcessResult.m3365getDispatchedToAPointerInputModifierimpl(m3297processBIzXfog)) {
                return m3297processBIzXfog;
            }
            this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return m3297processBIzXfog;
        }
        this.pointerInputEventProcessor.processCancel();
        return androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    static /* synthetic */ void sendSimulatedEvent$default(androidx.compose.ui.platform.AndroidComposeView androidComposeView, android.view.MotionEvent motionEvent, int i, long j, boolean z, int i2, java.lang.Object obj) {
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, (i2 & 8) != 0 ? true : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(android.view.MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int i = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            i = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new android.view.MotionEvent.PointerProperties();
        }
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new android.view.MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((i < 0 || i4 < i) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long mo3358localToScreenMKHz9U = mo3358localToScreenMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3358localToScreenMKHz9U);
            pointerCoords.y = androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3358localToScreenMKHz9U);
            i4++;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
        androidx.compose.ui.input.pointer.PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(obtain, androidComposeView);
        kotlin.jvm.internal.Intrinsics.checkNotNull(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m3297processBIzXfog(convertToPointerInputEvent$ui_release, androidComposeView, true);
        obtain.recycle();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.m3705canScroll0AR0LA0$ui_release(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.m3705canScroll0AR0LA0$ui_release(true, direction, this.lastDownPointerPosition);
    }

    private final boolean isInBounds(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo3358localToScreenMKHz9U(long localPosition) {
        recalculateWindowPosition();
        long m2358mapMKHz9U = androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.viewToWindowMatrix, localPosition);
        return androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(m2358mapMKHz9U) + androidx.compose.ui.geometry.Offset.m1871getXimpl(this.windowPosition), androidx.compose.ui.geometry.Offset.m1872getYimpl(m2358mapMKHz9U) + androidx.compose.ui.geometry.Offset.m1872getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo3357localToScreen58bKbWc(float[] localTransform) {
        recalculateWindowPosition();
        androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(localTransform, this.viewToWindowMatrix);
        androidx.compose.ui.platform.AndroidComposeView_androidKt.m3712preTranslatecG2Xzmc(localTransform, androidx.compose.ui.geometry.Offset.m1871getXimpl(this.windowPosition), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo3359screenToLocalMKHz9U(long positionOnScreen) {
        recalculateWindowPosition();
        return androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.windowToViewMatrix, androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(positionOnScreen) - androidx.compose.ui.geometry.Offset.m1871getXimpl(this.windowPosition), androidx.compose.ui.geometry.Offset.m1872getYimpl(positionOnScreen) - androidx.compose.ui.geometry.Offset.m1872getYimpl(this.windowPosition)));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            android.view.ViewParent parent = getParent();
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = this;
            while (parent instanceof android.view.ViewGroup) {
                androidComposeView = (android.view.View) parent;
                parent = ((android.view.ViewGroup) androidComposeView).getParent();
            }
            androidComposeView.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            androidComposeView.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = androidx.compose.ui.geometry.OffsetKt.Offset(f - iArr2[0], f2 - iArr2[1]);
        }
    }

    private final void recalculateWindowPosition(android.view.MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long m2358mapMKHz9U = androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.viewToWindowMatrix, androidx.compose.ui.geometry.OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = androidx.compose.ui.geometry.OffsetKt.Offset(motionEvent.getRawX() - androidx.compose.ui.geometry.Offset.m1871getXimpl(m2358mapMKHz9U), motionEvent.getRawY() - androidx.compose.ui.geometry.Offset.m1872getYimpl(m2358mapMKHz9U));
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo3713calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        androidx.compose.ui.platform.InvertMatrixKt.m3737invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) androidx.compose.ui.SessionMutex.m1755getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.getEditorHasFocus();
        }
        return androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession = (androidx.compose.ui.platform.AndroidPlatformTextInputSession) androidx.compose.ui.SessionMutex.m1755getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.createInputConnection(outAttrs);
        }
        return androidPlatformTextInputSession.createInputConnection(outAttrs);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo3666calculateLocalPositionMKHz9U(long positionInWindow) {
        recalculateWindowPosition();
        return androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo3667calculatePositionInWindowMKHz9U(long localPosition) {
        recalculateWindowPosition();
        return androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.density = androidx.compose.ui.unit.AndroidDensity_androidKt.Density(getContext());
        if (getFontWeightAdjustmentCompat(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(newConfig);
            setFontFamilyResolver(androidx.compose.ui.text.font.FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        androidx.compose.ui.unit.LayoutDirection layoutDirectionFromInt;
        if (this.superclassInitComplete) {
            layoutDirectionFromInt = androidx.compose.ui.platform.AndroidComposeView_androidKt.layoutDirectionFromInt(layoutDirection);
            setLayoutDirection(layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(layoutDirectionFromInt);
        }
    }

    private final boolean autofillSupported() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(event) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(event)) {
                if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                    return false;
                }
                android.view.MotionEvent motionEvent = this.previousMotionEvent;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.previousMotionEvent = android.view.MotionEvent.obtainNoHistory(event);
                this.hoverExitReceived = true;
                post(this.sendHoverExitEvent);
                return false;
            }
        } else if (!isPositionChanged(event)) {
            return false;
        }
        return androidx.compose.ui.input.pointer.ProcessResult.m3365getDispatchedToAPointerInputModifierimpl(m3694handleMotionEvent8iAsVTc(event));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isBadMotionEvent(android.view.MotionEvent event) {
        boolean z;
        float x = event.getX();
        if (!java.lang.Float.isInfinite(x) && !java.lang.Float.isNaN(x)) {
            float y = event.getY();
            if (!java.lang.Float.isInfinite(y) && !java.lang.Float.isNaN(y)) {
                float rawX = event.getRawX();
                if (!java.lang.Float.isInfinite(rawX) && !java.lang.Float.isNaN(rawX)) {
                    float rawY = event.getRawY();
                    if (!java.lang.Float.isInfinite(rawY) && !java.lang.Float.isNaN(rawY)) {
                        z = false;
                        if (!z) {
                            int pointerCount = event.getPointerCount();
                            for (int i = 1; i < pointerCount; i++) {
                                float x2 = event.getX(i);
                                if (!java.lang.Float.isInfinite(x2) && !java.lang.Float.isNaN(x2)) {
                                    float y2 = event.getY(i);
                                    if (!java.lang.Float.isInfinite(y2) && !java.lang.Float.isNaN(y2) && (android.os.Build.VERSION.SDK_INT < 29 || androidx.compose.ui.platform.MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(event, i))) {
                                        z = false;
                                        if (!z) {
                                            break;
                                        }
                                    }
                                }
                                z = true;
                                if (!z) {
                                }
                            }
                        }
                        return z;
                    }
                }
            }
        }
        z = true;
        if (!z) {
        }
        return z;
    }

    private final boolean isPositionChanged(android.view.MotionEvent event) {
        android.view.MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    private final android.view.View findViewByAccessibilityIdRootedAtCurrentView(int accessibilityId, android.view.View currentView) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("getAccessibilityViewId", new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.Intrinsics.areEqual(declaredMethod.invoke(currentView, new java.lang.Object[0]), java.lang.Integer.valueOf(accessibilityId))) {
            return currentView;
        }
        if (!(currentView instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) currentView;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, viewGroup.getChildAt(i));
            if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                return findViewByAccessibilityIdRootedAtCurrentView;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.input.pointer.PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int accessibilityId) {
        android.view.View view = null;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.Object invoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(accessibilityId));
                if (invoke instanceof android.view.View) {
                    view = (android.view.View) invoke;
                }
            } else {
                view = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, this);
            }
        } catch (java.lang.NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        androidx.lifecycle.Lifecycle lifecycle;
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == androidx.lifecycle.Lifecycle.State.RESUMED;
    }

    /* compiled from: AndroidComposeView.android.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "FocusTag", "", "MaximumLayerCacheSize", "", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (androidx.compose.ui.platform.AndroidComposeView.systemPropertiesClass == null) {
                    androidx.compose.ui.platform.AndroidComposeView.systemPropertiesClass = java.lang.Class.forName("android.os.SystemProperties");
                    java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.systemPropertiesClass;
                    androidx.compose.ui.platform.AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE) : null;
                }
                java.lang.reflect.Method method = androidx.compose.ui.platform.AndroidComposeView.getBooleanMethod;
                java.lang.Object invoke = method != null ? method.invoke(null, "debug.layout", false) : null;
                java.lang.Boolean bool = invoke instanceof java.lang.Boolean ? (java.lang.Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final androidx.lifecycle.LifecycleOwner lifecycleOwner;
        private final androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final androidx.savedstate.SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$AndroidComposeViewTranslationCallback;", "Landroid/view/translation/ViewTranslationCallback;", "()V", "onClearTranslation", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onHideTranslation", "onShowTranslation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AndroidComposeViewTranslationCallback implements android.view.translation.ViewTranslationCallback {
        @Override // android.view.translation.ViewTranslationCallback
        public boolean onShowTranslation(android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((androidx.compose.ui.platform.AndroidComposeView) view).composeAccessibilityDelegate.onShowTranslation$ui_release();
            return true;
        }

        @Override // android.view.translation.ViewTranslationCallback
        public boolean onHideTranslation(android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((androidx.compose.ui.platform.AndroidComposeView) view).composeAccessibilityDelegate.onHideTranslation$ui_release();
            return true;
        }

        @Override // android.view.translation.ViewTranslationCallback
        public boolean onClearTranslation(android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((androidx.compose.ui.platform.AndroidComposeView) view).composeAccessibilityDelegate.onClearTranslation$ui_release();
            return true;
        }
    }
}
