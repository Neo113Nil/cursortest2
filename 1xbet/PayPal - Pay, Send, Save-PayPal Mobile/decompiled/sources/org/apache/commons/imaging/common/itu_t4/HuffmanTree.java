package org.apache.commons.imaging.common.itu_t4;

/* loaded from: classes17.dex */
class HuffmanTree<T> {
    private final java.util.List<org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<T>> nodes = new java.util.ArrayList();

    HuffmanTree() {
    }

    static final class Node<T> {
        boolean empty;
        T value;

        private Node() {
            this.empty = true;
        }
    }

    public final void insert(java.lang.String str, T t) throws org.apache.commons.imaging.common.itu_t4.HuffmanTreeException {
        org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<T> growAndGetNode = growAndGetNode(0);
        if (growAndGetNode.value != null) {
            throw new org.apache.commons.imaging.common.itu_t4.HuffmanTreeException("Can't add child to a leaf");
        }
        org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<T> node = growAndGetNode;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = str.charAt(i2) == '0' ? (i << 1) + 1 : (i + 1) << 1;
            node = growAndGetNode(i);
            if (node.value != null) {
                throw new org.apache.commons.imaging.common.itu_t4.HuffmanTreeException("Can't add child to a leaf");
            }
        }
        node.value = t;
    }

    private org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<T> growAndGetNode(int i) {
        while (i >= this.nodes.size()) {
            this.nodes.add(new org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<>());
        }
        org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<T> node = this.nodes.get(i);
        node.empty = false;
        return node;
    }

    public final T decode(org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible bitInputStreamFlexible) throws org.apache.commons.imaging.common.itu_t4.HuffmanTreeException {
        int i = 0;
        org.apache.commons.imaging.common.itu_t4.HuffmanTree.Node<T> node = this.nodes.get(0);
        while (node.value == null) {
            try {
                i = bitInputStreamFlexible.readBits(1) == 0 ? (i << 1) + 1 : (i + 1) << 1;
                if (i >= this.nodes.size()) {
                    throw new org.apache.commons.imaging.common.itu_t4.HuffmanTreeException("Invalid bit pattern");
                }
                node = this.nodes.get(i);
                if (node.empty) {
                    throw new org.apache.commons.imaging.common.itu_t4.HuffmanTreeException("Invalid bit pattern");
                }
            } catch (java.io.IOException e) {
                throw new org.apache.commons.imaging.common.itu_t4.HuffmanTreeException("Error reading stream for huffman tree", e);
            }
        }
        return node.value;
    }
}
